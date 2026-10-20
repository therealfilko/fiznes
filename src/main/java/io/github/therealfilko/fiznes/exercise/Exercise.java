package io.github.therealfilko.fiznes.exercise;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "equipment", nullable = false)
    private boolean equipment;

    @OneToMany(
            mappedBy = "exercise"
    )
    private List<ExerciseMuscleGroup> exerciseLinks = new ArrayList<>();

    public boolean isEquipment() {
        return equipment;
    }

    public void setEquipment(boolean equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
