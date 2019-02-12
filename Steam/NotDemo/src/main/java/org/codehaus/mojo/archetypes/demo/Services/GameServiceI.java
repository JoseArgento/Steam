package org.codehaus.mojo.archetypes.demo.Services;

import java.util.List;
import org.codehaus.mojo.archetypes.demo.Model.Game;

public interface GameServiceI 
{  
    Game findGameById(int id);  
    List<Game> findAllGames();
    void deleteGameById(int id);
    void saveGame(Game g);       
}
