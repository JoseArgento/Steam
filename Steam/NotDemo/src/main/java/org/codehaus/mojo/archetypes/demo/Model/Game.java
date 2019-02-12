package org.codehaus.mojo.archetypes.demo.Model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Game extends Item
{
    @OneToMany(fetch = FetchType.EAGER)
    Set<Mod> mods;
}
