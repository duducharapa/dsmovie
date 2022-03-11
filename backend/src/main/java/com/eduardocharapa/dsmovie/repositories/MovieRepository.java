package com.eduardocharapa.dsmovie.repositories;

import com.eduardocharapa.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}