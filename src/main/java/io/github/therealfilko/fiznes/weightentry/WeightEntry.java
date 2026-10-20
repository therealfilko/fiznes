package io.github.therealfilko.fiznes.weightentry;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "weight_entries")
@EntityListeners(AuditingEntityListener.class)
public class WeightEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "datum", nullable = false)
    private LocalDate datum;

    @Column(name = "gewicht", nullable = false)
    private BigDecimal gewicht;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    public WeightEntry() {}

    public WeightEntry(LocalDate datum, BigDecimal gewicht) {
        this.datum = datum;
        this.gewicht = gewicht;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public BigDecimal getGewicht() {
        return gewicht;
    }

    public void setGewicht(BigDecimal gewicht) {
        this.gewicht = gewicht;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
