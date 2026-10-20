package io.github.therealfilko.fiznes.musclegroup;

import io.github.therealfilko.fiznes.exercise.ExerciseMuscleGroup;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "muscle_groups")
public class MuscleGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "body_region_key", nullable = false)
    private String bodyRegionKey;

    @OneToMany(
            mappedBy = "muscleGroup"
    )
    private List<ExerciseMuscleGroup> muscleGroupLinks = new ArrayList<>();


    public String getBodyRegionKey() {
        return bodyRegionKey;
    }

    public void setBodyRegionKey(String bodyRegionKey) {
        this.bodyRegionKey = bodyRegionKey;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
