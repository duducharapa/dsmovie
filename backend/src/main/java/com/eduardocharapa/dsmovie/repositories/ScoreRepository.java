package com.eduardocharapa.dsmovie.repositories;

import com.eduardocharapa.dsmovie.entities.Score;
import com.eduardocharapa.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {}