package com.miage.bibliotheque;

import com.miage.bibliotheque.Livre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-07T14:45:59")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, String> description;
    public static volatile SingularAttribute<Categorie, Long> id;
    public static volatile ListAttribute<Categorie, Livre> livres;
    public static volatile SingularAttribute<Categorie, String> nom;

}