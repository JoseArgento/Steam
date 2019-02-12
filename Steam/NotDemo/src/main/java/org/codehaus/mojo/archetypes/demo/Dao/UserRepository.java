package org.codehaus.mojo.archetypes.demo.Dao;

import org.codehaus.mojo.archetypes.demo.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> 
{
    
}
