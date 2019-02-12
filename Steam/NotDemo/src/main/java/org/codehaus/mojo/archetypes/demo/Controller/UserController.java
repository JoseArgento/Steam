package org.codehaus.mojo.archetypes.demo.Controller;

import org.codehaus.mojo.archetypes.demo.Model.User;
import org.codehaus.mojo.archetypes.demo.Services.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/users")
public class UserController 
{
    @Autowired
    private UserSerivce uService;
    
    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestBody User u)
    {
        uService.saveUser(u);
        return "User added";
    }
    
    @GetMapping(path="/find")
    public @ResponseBody User find(@RequestParam int id)
    {
       return uService.findUserById(id);
    }
    
    @GetMapping(path="/findall")
    public @ResponseBody Iterable<User> findAllUsers()
    {
        return uService.findAllUsers();
    }
    
    @DeleteMapping(path="/delete")
    public @ResponseBody String deleteUserById(@RequestParam int id)
    {
        uService.deleteUserById(id);
        return "Delete done";
    }
    
    @PostMapping(path="/update")
    public @ResponseBody String updateUser(@RequestBody User u)
    {
        uService.saveUser(u);
        return "User updated";
    }
}
