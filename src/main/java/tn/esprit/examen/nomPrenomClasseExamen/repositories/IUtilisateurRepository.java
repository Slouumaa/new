package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Utilisateur;

import java.util.Optional;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}
