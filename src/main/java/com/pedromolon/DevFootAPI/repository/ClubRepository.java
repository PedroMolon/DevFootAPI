package com.pedromolon.DevFootAPI.repository;

import com.pedromolon.DevFootAPI.domain.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
}
