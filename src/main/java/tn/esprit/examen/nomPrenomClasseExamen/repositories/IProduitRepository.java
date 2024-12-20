package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Etat;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Produit;

import java.util.List;


public interface IProduitRepository extends JpaRepository<Produit,Long> {


    boolean findByNomProduitAndEtat(String nomProduit, Etat etat);
}
