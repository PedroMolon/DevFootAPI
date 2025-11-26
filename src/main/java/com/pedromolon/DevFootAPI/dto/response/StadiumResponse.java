package com.pedromolon.DevFootAPI.dto.response;

import lombok.Builder;

@Builder
public record StadiumResponse(
        Long id,
        String name,
        String city,
        Integer capacity,
        String urlImg
) {}
