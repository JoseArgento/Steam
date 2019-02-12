package org.codehaus.mojo.archetypes.demo.Services;

import java.util.List;
import org.codehaus.mojo.archetypes.demo.Dao.GameRepository;
import org.codehaus.mojo.archetypes.demo.Model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService implements GameServiceI
{
    @Autowired
    GameRepository gameRepo;
    
    @Override
    public Game findGameById(int id) 
    {
        Game g = gameRepo.findById(id).orElse(null);
        return g;
    }
    @Override
    public List<Game> findAllGames() 
    {
        List<Game> gameList = (List<Game>) gameRepo.findAll();
        return gameList;
    }
    @Override
    public void deleteGameById(int id) 
    {
        gameRepo.deleteById(id);
    }  
    @Override
    public void saveGame(Game g) 
    {
        gameRepo.save(g);
    } 
    
}
