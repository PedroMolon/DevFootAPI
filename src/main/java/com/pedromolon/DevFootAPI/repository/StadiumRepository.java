package com.pedromolon.DevFootAPI.repository;

import com.pedromolon.DevFootAPI.domain.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
