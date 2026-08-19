package io.github.therealfilko.fiznes.weightentry.dto;

import java.time.LocalDate;

public record WeightEntryResponse(Long id, LocalDate datum, float gewicht) {}
