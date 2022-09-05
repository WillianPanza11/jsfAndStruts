
package com.actions;

import com.model.Persona;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonasAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona; 
    
    @Override
    public String execute(){
       if(this.persona!=null){
           log.info("\n");
           log.info("persona: " +persona);
       } else{
           log.info("Persona con valor null");
       }
       return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
