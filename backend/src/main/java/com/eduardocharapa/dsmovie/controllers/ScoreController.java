package com.eduardocharapa.dsmovie.controllers;

import com.eduardocharapa.dsmovie.dto.MovieDTO;
import com.eduardocharapa.dsmovie.dto.ScoreDTO;
import com.eduardocharapa.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    
    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

}
