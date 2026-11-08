package io.github.therealfilko.fiznes.exercise;

import io.github.therealfilko.fiznes.exercise.dto.ExerciseResponse;
import io.github.therealfilko.fiznes.exercise.dto.ExerciseSummaryResponse;
import io.github.therealfilko.fiznes.musclegroup.dto.MuscleGroupResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {
    private ExerciseRepository exerciseRepository = null;
    private final ExerciseMuscleGroupRepository exerciseMuscleGroupRepository;

    public ExerciseService(ExerciseRepository exerciseRepository, ExerciseMuscleGroupRepository exerciseMuscleGroupRepository) {
        this.exerciseRepository = exerciseRepository;
        this.exerciseMuscleGroupRepository = exerciseMuscleGroupRepository;
    }

    private ExerciseResponse mapToExerciseResponse(Exercise exercise) {
        ExerciseResponse mappedExercise = new ExerciseResponse(
                exercise.getId(),
                exercise.getName(),
                exercise.isEquipment(),
                mapToMuscleGroupResponse(exercise.getExerciseLinks())
        );
        return mappedExercise;
    }

    private List<MuscleGroupResponse> mapToMuscleGroupResponse(List<ExerciseMuscleGroup> foo) {
        List<MuscleGroupResponse> mappedMuscleGroup = foo.stream().map(junctionData ->
                new MuscleGroupResponse(
                        junctionData.getMuscleGroup().getId(),
                        junctionData.getMuscleGroup().getName(),
                        junctionData.getMuscleGroup().getBodyRegionKey(),
                        junctionData.getType()
                )).toList();
        return mappedMuscleGroup;
    }

    private ExerciseSummaryResponse mapExercise(Exercise exercise) {
        return new ExerciseSummaryResponse(exercise.getId(), exercise.getName(), exercise.isEquipment());
    }


    public ExerciseResponse getExerciseById(int id) {
        Optional<Exercise> exerciseOptional = exerciseRepository.findByIdWithMuscleGroups(id);

        if (exerciseOptional.isEmpty()) {
            throw new RuntimeException("404 - Eintrag nicht gefunden!");
        }

        Exercise queryData = exerciseOptional.get();

        ExerciseResponse exercise = mapToExerciseResponse(queryData);

        return exercise;
    }

    public List<ExerciseSummaryResponse> getAllExercise() {
        List<Exercise> listExercise = exerciseRepository.findAll();
        return listExercise.stream().map(e ->
                mapExercise(e)).toList();
    }

}
