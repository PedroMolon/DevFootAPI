package com.pedromolon.DevFootAPI.domain;

import com.pedromolon.DevFootAPI.domain.enums.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Position position;

    @Column(name = "shirt_number")
    private int shirtNumber;

    @Column(name = "url_img")
    private String urlImg;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

}
