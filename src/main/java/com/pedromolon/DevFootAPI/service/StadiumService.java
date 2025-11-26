package com.pedromolon.DevFootAPI.service;

import com.pedromolon.DevFootAPI.dto.request.StadiumRequest;
import com.pedromolon.DevFootAPI.dto.response.StadiumResponse;
import com.pedromolon.DevFootAPI.mapper.StadiumMapper;
import com.pedromolon.DevFootAPI.repository.StadiumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumService {

    private final StadiumRepository stadiumRepository;
    private final StadiumMapper stadiumMapper;

    public StadiumService(StadiumRepository stadiumRepository, StadiumMapper stadiumMapper) {
        this.stadiumRepository = stadiumRepository;
        this.stadiumMapper = stadiumMapper;
    }

    public List<StadiumResponse> findAll() {
        return stadiumRepository.findAll()
                .stream()
                .map(stadiumMapper::toResponse)
                .toList();
    }

    public StadiumResponse findById(Long id) {
        return stadiumRepository.findById(id)
                .map(stadiumMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Stadium not found"));
    }

    public StadiumResponse create(StadiumRequest request) {
        return stadiumMapper.toResponse(
                stadiumRepository.save(stadiumMapper.toEntity(request))
        );
    }

}
