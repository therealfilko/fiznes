package io.github.therealfilko.fiznes.exercise;

import io.github.therealfilko.fiznes.exercise.dto.ExerciseResponse;

import java.util.Optional;

public class ExerciseService {
    private final ExerciseRepository exerciseRepository;
    private final ExerciseMuscleGroupRepository exerciseMuscleGroupRepository;

    public ExerciseService(ExerciseRepository exerciseRepository, ExerciseMuscleGroupRepository exerciseMuscleGroupRepository) {
        this.exerciseRepository = exerciseRepository;
        this.exerciseMuscleGroupRepository = exerciseMuscleGroupRepository;
    }

    public ExerciseResponse getExerciseById(long id) {
        Optional<ExerciseMuscleGroup> exerciseOptional = exerciseMuscleGroupRepository.findById(id);
        exerciseMuscleGroupRepository.
    }
}
