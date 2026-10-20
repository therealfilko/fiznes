package io.github.therealfilko.fiznes.exercise;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExerciseMuscleGroupId implements Serializable {
    @Column(name = "exercise_id")
    private int exerciseId;

    @Column(name = "muscle_group_id")
    private int muscleGroupId;

    public ExerciseMuscleGroupId() {}

    public ExerciseMuscleGroupId(int exerciseId, int muscleGroupId) {
        this.exerciseId = exerciseId;
        this.muscleGroupId = muscleGroupId;
    }

    public long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public long getMuscleGroupId() {
        return muscleGroupId;
    }

    public void setMuscleGroupId(int muscleGroupId) {
        this.muscleGroupId = muscleGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseMuscleGroupId that = (ExerciseMuscleGroupId) o;
        return getExerciseId() == that.getExerciseId() && getMuscleGroupId() == that.getMuscleGroupId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExerciseId(), getMuscleGroupId());
    }
}
