package io.github.therealfilko.fiznes.weightentry.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UpdateWeightEntryRequest(LocalDate datum, BigDecimal gewicht) {}
