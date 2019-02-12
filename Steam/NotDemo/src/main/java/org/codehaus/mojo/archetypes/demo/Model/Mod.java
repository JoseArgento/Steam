package org.codehaus.mojo.archetypes.demo.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class Mod extends Item
{
    @ManyToOne(fetch = FetchType.EAGER)
    Game game;
}
