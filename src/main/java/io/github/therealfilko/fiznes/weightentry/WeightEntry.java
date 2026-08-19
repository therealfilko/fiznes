package io.github.therealfilko.fiznes.weightentry;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "weight_entries")
@EntityListeners(AuditingEntityListener.class)
public class WeightEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "datum", nullable = false)
    private LocalDate datum;

    @Column(name = "gewicht", nullable = false)
    private float gewicht;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    public WeightEntry() {}

    public WeightEntry(LocalDate datum, float gewicht) {
        this.datum = datum;
        this.gewicht = gewicht;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
