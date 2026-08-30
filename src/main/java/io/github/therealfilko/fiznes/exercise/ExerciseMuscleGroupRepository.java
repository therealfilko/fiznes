package io.github.therealfilko.fiznes.exercise;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExerciseMuscleGroupRepository extends JpaRepository<ExerciseMuscleGroup, ExerciseMuscleGroupId> {
    Optional<ExerciseMuscleGroup> findById(long id);
}
