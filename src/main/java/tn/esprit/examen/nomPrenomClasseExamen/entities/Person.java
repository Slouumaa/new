package tn.esprit.examen.nomPrenomClasseExamen.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long personId;
    String name;
    @Enumerated(EnumType.STRING)
    Role role;
    Integer nbrMonthsTraining;
    LocalDate dateOfBirth;
    @JsonIgnore
    @OneToMany(mappedBy = "coach")
    Set<Course> directedCourses;
    @JsonIgnore
    @ManyToMany(mappedBy = "participants")
    Set<Course> myCourses;

}
