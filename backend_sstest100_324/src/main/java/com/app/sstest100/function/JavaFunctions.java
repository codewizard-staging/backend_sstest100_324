package com.app.sstest100.function;

import com.app.sstest100.model.Manager;
import com.app.sstest100.model.Pet;
import com.app.sstest100.model.PetCareCenter;
import com.app.sstest100.model.PetOwner;
import com.app.sstest100.model.Document;
import com.app.sstest100.model.PetService;
import com.app.sstest100.enums.PetServiceType;
import com.app.sstest100.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.sstest100.repository.PetServiceRepository;
import com.app.sstest100.repository.PetOwnerRepository;
import com.app.sstest100.repository.PetCareCenterRepository;
import com.app.sstest100.repository.ManagerRepository;
import com.app.sstest100.repository.DocumentRepository;
import com.app.sstest100.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
