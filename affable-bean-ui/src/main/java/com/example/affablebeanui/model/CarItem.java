package com.example.affablebeanui.model;

import com.fasterxml.jackson.annotation.JsonTypeId;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CarItem(
        Integer id,
        String name,
        double price,
        String description,
        int quantity,

        LocalDate lastUpdate

) {
}
