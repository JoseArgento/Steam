package org.codehaus.mojo.archetypes.demo.Dao;

import org.codehaus.mojo.archetypes.demo.Model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game,Integer>
{
    
}
