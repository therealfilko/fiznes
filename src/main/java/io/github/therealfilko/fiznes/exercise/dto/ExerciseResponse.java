package io.github.therealfilko.fiznes.exercise.dto;

import io.github.therealfilko.fiznes.musclegroup.dto.MuscleGroupResponse;

import java.util.List;

public record ExerciseResponse(long id, String name, boolean equipment, List<MuscleGroupResponse> muscleGroups) {
}
