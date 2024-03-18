package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.DiagnosticoDTO;
import com.example.ParcticaMetaenlace_1.modelo.Diagnostico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DiagnosticoMapper {

    DiagnosticoMapper INSTANCE = Mappers.getMapper(DiagnosticoMapper.class);

    @Mapping(source = "citaId", target = "cita.id")
    Diagnostico diagnosticoDTOToDiagnostico(DiagnosticoDTO diagnosticoDTO);

    @Mapping(source = "cita.id", target = "citaId")
    DiagnosticoDTO diagnosticoToDiagnosticoDTO(Diagnostico diagnostico);
}




