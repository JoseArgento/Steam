package org.codehaus.mojo.archetypes.demo.Model;

import java.time.OffsetDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public abstract class BaseEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            
    Integer id;
    OffsetDateTime creationdate;
    OffsetDateTime editionDate;
    OffsetDateTime deletionDate;   
}
