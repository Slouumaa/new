package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Categorie;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Etat;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Produit;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Utilisateur;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.ICategorieRepository;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IProduitRepository;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IUtilisateurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProduitServicesImpl implements IProduitServices {
    private final IProduitRepository produitRepository;
    private final ICategorieRepository categorieRepository;
    private final IUtilisateurRepository utilisateurRepository;



    @Override
    public Produit ajouterProduitEtCategories(Produit p){
        Set<Categorie> categories = p.getCategories();
        categorieRepository.saveAll(categories);

        p.setCategories(categories);
        return produitRepository.save(p);

    }

    @Override
    public void affecterProdAUser(List<String> nomProduit, String email) {
        
    }


}
