package com.pedromolon.DevFootAPI.dto.request;

import jakarta.validation.constraints.NotNull;

public record StadiumRequest(
        @NotNull(message = "Name cannot be null")
        String name,

        @NotNull(message = "City cannot be null")
        String city,

        Integer capacity,

        String urlImg
) {}
