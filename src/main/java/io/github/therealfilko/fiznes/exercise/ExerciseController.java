package io.github.therealfilko.fiznes.exercise;

import io.github.therealfilko.fiznes.exercise.dto.ExerciseResponse;
import io.github.therealfilko.fiznes.exercise.dto.ExerciseSummaryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/exercises")
public class ExerciseController {
    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/{id}")
    public ExerciseResponse getExerciseById(@PathVariable Integer id) {
        return exerciseService.getExerciseById(id);
    }

    @GetMapping
    public List<ExerciseSummaryResponse> getExercises() {
        return exerciseService.getAllExercise();
    }

// Was wir noch hinzufügen können ist eine Filter Funktion für Filtern nach muskelgruppe
// und wir geben dann die Liste von Übungen für die ausgewählte Muskelgruppe aus

}

