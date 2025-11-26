package com.pedromolon.DevFootAPI.domain.enums;

import lombok.Getter;

@Getter
public enum Position {
    GOALKEEPER("Goalkeeper"),
    DEFENDER("Defender"),
    MIDFIELDER("Midfielder"),
    FORWARD("Forward");

    private final String label;

    Position(String label) {
        this.label = label;
    }
}
