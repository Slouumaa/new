package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Utilisateur;
import tn.esprit.examen.nomPrenomClasseExamen.services.IServices;
import tn.esprit.examen.nomPrenomClasseExamen.services.IUtilisateurServices;

@RequiredArgsConstructor
@RequestMapping("utilisateur")
@RestController
public class UtilisateurRestController {
    private final IUtilisateurServices utilisateurServices;
    @PostMapping("/add")
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur u) {
        return utilisateurServices.addUtilisateur(u);}

}
