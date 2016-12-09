/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque.services;

import com.miage.bibliotheque.Categorie;
import com.miage.bibliotheque.beans.CategorieFacade;
import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
        return this.findAll();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Categorie ReadCategorie(@PathParam("id")Long id){
        return this.find(id);
    }
    
    @Transactional
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String CreateCategorie(@FormParam("nom")String nom, @FormParam("description")String description){
        Categorie c = new Categorie();
        c.setNom(nom);
        c.setDescription(description);
        List<Categorie> listeCategories = this.findAll();
        for(Categorie uneCategorie : listeCategories) {
            if(uneCategorie.equals(c)) {
                return "La catégorie existe déjà.";
            }
        }
        //System.out.print("Catégorie [ID = "+c.getId() + "; nom = "+ c.getNom() + "; description = " + c.getDescription()+ "]");
        this.create(c);
        return "La catégorie a été ajoutée.";
    }
    
    @Transactional
    @DELETE
    @Path("{id}")
    public String DeleteCategorie(@PathParam("id")Long id){
        String message = "Test";
        if(this.find(id)!=null) {
            this.remove(this.find(id));
            message = "La catégorie a bien été supprimée.";
        } else {
            message = "La catégorie n'existe pas.";
        }
        return message;
    }

    @Transactional
    @PUT
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType. APPLICATION_FORM_URLENCODED)
    @Path("{id}")
    public String UpdateCategorie(@PathParam("id")Long id, @FormParam("nom")String nom, @FormParam("description")String description){
        String message = "";
        Categorie c = this.find(id);
        if(c!=null) {
            c.setNom(nom);
            c.setDescription(description);
            this.edit(c);
            message = "La catégorie a bien été mise à jour.";
        } else {
            message = "La catégorie n'existe pas.";
        }
        return message;
    }
 
    @GET
    @Path("/count")
    public String CountCategorie(){
        return "Il y a : " + this.count() + " catégorie(s).";
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{min}/{max}")
    public List<Categorie> FindByRangeCategorie(@PathParam("min")int min, @PathParam("max")int max){
        return this.findRange(new int[] {min,max});
    }
}
