package org.codehaus.mojo.archetypes.demo.Model;

import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
@MappedSuperclass
public class Description extends BaseEntity
{
    String webDescription;
    String mobileDescription;
}
