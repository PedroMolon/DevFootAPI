package com.pedromolon.DevFootAPI.controller;

import com.pedromolon.DevFootAPI.dto.request.StadiumRequest;
import com.pedromolon.DevFootAPI.dto.response.StadiumResponse;
import com.pedromolon.DevFootAPI.service.StadiumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {

    private final StadiumService stadiumService;

    public StadiumController(StadiumService stadiumService) {
        this.stadiumService = stadiumService;
    }

    @GetMapping
    public ResponseEntity<List<StadiumResponse>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(stadiumService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StadiumResponse> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(stadiumService.findById(id));
    }

    @PostMapping
    public ResponseEntity<StadiumResponse> create(@RequestBody StadiumRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(stadiumService.create(request));
    }

}
