package io.github.therealfilko.fiznes.musclegroup;

import jakarta.persistence.*;

@Entity
@Table(name = "muscle_groups")
public class MuscleGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "body_region_key", nullable = false)
    private String bodyRegionKey;

    public String getBodyRegionKey() {
        return bodyRegionKey;
    }

    public void setBodyRegionKey(String bodyRegionKey) {
        this.bodyRegionKey = bodyRegionKey;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
