package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Exercise implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long exerciceId;
    String title;
    Integer nbrOfRepetitions;
    Integer breakTime;
    Integer duration;
}
