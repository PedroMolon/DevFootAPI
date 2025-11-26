package com.pedromolon.DevFootAPI.mapper;

import com.pedromolon.DevFootAPI.domain.Stadium;
import com.pedromolon.DevFootAPI.dto.request.StadiumRequest;
import com.pedromolon.DevFootAPI.dto.response.StadiumResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StadiumMapper {

    Stadium toEntity(StadiumRequest request);

    StadiumResponse toResponse(Stadium stadium);

}
