package org.codehaus.mojo.archetypes.demo.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseNamedEntity extends BaseEntity
{   
    String name;       
}
