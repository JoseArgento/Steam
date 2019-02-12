package org.codehaus.mojo.archetypes.demo.Services;

import java.util.List;
import org.codehaus.mojo.archetypes.demo.Dao.UserRepository;
import org.codehaus.mojo.archetypes.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivce implements UserServiceI
{
    @Autowired
    UserRepository userRepo;
    
    @Override
    public User findUserById(int id) 
    {
        User u = userRepo.findById(id).orElse(null);
        return u;
    }
    @Override
    public List<User> findAllUsers() 
    {
        List<User> gameList = (List<User>) userRepo.findAll();
        return gameList;
    }
    @Override
    public void deleteUserById(int id) 
    {
        userRepo.deleteById(id);
    }  
    @Override
    public void saveUser(User u) 
    {
        userRepo.save(u);
    }  
}
