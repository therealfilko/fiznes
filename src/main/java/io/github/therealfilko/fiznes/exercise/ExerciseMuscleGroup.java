package io.github.therealfilko.fiznes.exercise;

import io.github.therealfilko.fiznes.musclegroup.MuscleGroup;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "exercise_muscle_groups")
public class ExerciseMuscleGroup {
    @EmbeddedId
    private ExerciseMuscleGroupId id;

    @ManyToOne
    @MapsId("exerciseId")
    private Exercise exercise;

    @ManyToOne
    @MapsId("muscleGroupId")
    private MuscleGroup muscleGroup;

    @Column(name = "type", nullable = false)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExerciseMuscleGroupId getId() {
        return id;
    }

    public void setId(ExerciseMuscleGroupId id) {
        this.id = id;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseMuscleGroup that = (ExerciseMuscleGroup) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getExercise(), that.getExercise()) && Objects.equals(getMuscleGroup(), that.getMuscleGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getExercise(), getMuscleGroup());
    }
}
