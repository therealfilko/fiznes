package io.github.therealfilko.fiznes.exercise;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExerciseMuscleGroupId implements Serializable {
    @Column(name = "exercise_id")
    private long exerciseId;

    @Column(name = "muscle_group_id")
    private long muscleGroupId;

    public ExerciseMuscleGroupId() {}

    public ExerciseMuscleGroupId(long exerciseId, long muscleGroupId) {
        this.exerciseId = exerciseId;
        this.muscleGroupId = muscleGroupId;
    }

    public long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public long getMuscleGroupId() {
        return muscleGroupId;
    }

    public void setMuscleGroupId(long muscleGroupId) {
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
