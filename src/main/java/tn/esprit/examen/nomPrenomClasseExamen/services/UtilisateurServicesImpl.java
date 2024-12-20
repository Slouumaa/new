package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Utilisateur;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.ICourseRepository;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IUtilisateurRepository;
@Slf4j
@Service
@RequiredArgsConstructor
public class UtilisateurServicesImpl implements IUtilisateurServices{
    private final IUtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur addUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

}
