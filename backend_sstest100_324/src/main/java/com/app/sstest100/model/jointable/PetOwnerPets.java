package com.app.sstest100.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.sstest100.model.Manager;
import com.app.sstest100.model.Pet;
import com.app.sstest100.model.PetCareCenter;
import com.app.sstest100.model.PetOwner;
import com.app.sstest100.model.Document;
import com.app.sstest100.model.PetService;
import com.app.sstest100.enums.PetServiceType;
import com.app.sstest100.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"sstest100_282\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}