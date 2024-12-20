package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private LocalDate dateInscri;
    @Enumerated(EnumType.STRING)
    private TypeUtilisateur typeUtilisateur;
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    Set<Produit> produits;
}
