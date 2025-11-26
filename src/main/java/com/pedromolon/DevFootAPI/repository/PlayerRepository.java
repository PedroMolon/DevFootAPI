package com.pedromolon.DevFootAPI.repository;

import com.pedromolon.DevFootAPI.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
