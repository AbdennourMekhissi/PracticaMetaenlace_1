package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.PacienteDTO;
import com.example.ParcticaMetaenlace_1.modelo.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

    PacienteMapper INSTANCE = Mappers.getMapper(PacienteMapper.class);

    @Mapping(source = "medicos", target = "medicos")
    @Mapping(source = "citasPaciente", target = "citas")
    PacienteDTO pacienteToPacienteDTO(Paciente paciente);

    @Mapping(source = "medicos", target = "medicos")
    @Mapping(source = "citas", target = "citasPaciente")
    Paciente pacienteDTOToPaciente(PacienteDTO pacienteDTO);
}
