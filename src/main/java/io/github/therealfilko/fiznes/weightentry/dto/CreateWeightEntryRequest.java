package io.github.therealfilko.fiznes.weightentry.dto;

import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateWeightEntryRequest(LocalDate datum, BigDecimal gewicht){}
