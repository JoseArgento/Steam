package org.codehaus.mojo.archetypes.demo.Controller;

import org.codehaus.mojo.archetypes.demo.Model.Game;
import org.codehaus.mojo.archetypes.demo.Services.GameService;
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
@RequestMapping(path="/games")
public class GameController 
{
    @Autowired
    private GameService gService;
    
    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestBody Game u)
    {
        gService.saveGame(u);
        return "User added";
    }
    
    @GetMapping(path="/find")
    public @ResponseBody Game find(@RequestParam int id)
    {
       return gService.findGameById(id);
    }
    
    @GetMapping(path="/findall")
    public @ResponseBody Iterable<Game> findAllUsers()
    {
        return gService.findAllGames();
    }
    
    @DeleteMapping(path="/delete")
    public @ResponseBody String deleteUserById(@RequestParam int id)
    {
        gService.deleteGameById(id);
        return "Delete done";
    }
    
    @PostMapping(path="/update")
    public @ResponseBody String updateUser(@RequestBody Game u)
    {
        gService.saveGame(u);
        return "Game updated";
    }
}
