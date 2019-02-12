package org.codehaus.mojo.archetypes.demo.Services;

import java.util.List;
import org.codehaus.mojo.archetypes.demo.Model.User;

public interface UserServiceI 
{
    User findUserById(int id);  
    List<User> findAllUsers();
    void deleteUserById(int id);
    void saveUser(User g);      
}
