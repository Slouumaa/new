package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long courseId;
    Integer num;
    LocalDate date;
    Integer duration;
    @Enumerated(EnumType.STRING)
    Level level;
    @ManyToOne
    Person coach;
    @ManyToMany
    Set<Person> participants;
    @OneToMany(cascade = CascadeType.PERSIST)
    Set<Exercise> exercises;
}
