package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Course;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Level;

import java.time.LocalDate;
import java.util.List;

public interface ICourseRepository extends CrudRepository<Course, Long> {

   // List<Course> findByLevelAndCoach_NameAndDateBefore(Level level, String name, LocalDate date);

    List<Course> findByLevelAndCoach_NameAndDateBefore(Level level, String name, LocalDate date);
    Course findByNum(Integer num);
}