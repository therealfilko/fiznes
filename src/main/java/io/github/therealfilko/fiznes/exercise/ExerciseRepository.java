package io.github.therealfilko.fiznes.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
    @Query("""
SELECT ex
FROM Exercise ex
JOIN FETCH ex.exerciseLinks em
JOIN FETCH em.muscleGroup eg
WHERE ex.id = :exId

""")
    Optional<Exercise> findByIdWithMuscleGroups(@Param("exId") Integer exId);
}
