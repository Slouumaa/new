package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Produit;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Utilisateur;
import tn.esprit.examen.nomPrenomClasseExamen.services.IProduitServices;
import tn.esprit.examen.nomPrenomClasseExamen.services.IUtilisateurServices;

@RequiredArgsConstructor
@RequestMapping("produit")
@RestController
public class ProduitRestController {

    private final IProduitServices produitServices;
    @PostMapping("/add")
    public Produit saveUtilisateur(@RequestBody Produit p) {
        return produitServices.ajouterProduitEtCategories(p);}
}
