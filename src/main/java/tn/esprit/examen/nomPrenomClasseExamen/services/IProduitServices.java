package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.Produit;

import java.util.List;

public interface IProduitServices {
    Produit ajouterProduitEtCategories(Produit p);
    void affecterProdAUser(List<String>nomProduit,String email);


}
