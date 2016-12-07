/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque.services;

import com.miage.bibliotheque.Categorie;
import com.miage.bibliotheque.beans.AbstractFacade;
import com.miage.bibliotheque.beans.CategorieFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author fatiz/mehmet
 */

@Path("categorie")
public class CategorieRessource extends CategorieFacade{

  
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List <Categorie> list(){
     return super.findAll();
    }

    /*@GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
   public String GetCategorie(){
        return "La ressource demandée existe!";
    }
    
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String PostCategorie(){
        return "La ressource demandée existe!";
    }*/

  
}
