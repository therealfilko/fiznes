package io.github.therealfilko.fiznes.weightentry.dto;

import java.time.LocalDate;

public record UpdateWeightEntryRequest(LocalDate datum, float gewicht) {}
