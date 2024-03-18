package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;
import com.example.ParcticaMetaenlace_1.modelo.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicoMapper {

    MedicoMapper INSTANCE = Mappers.getMapper(MedicoMapper.class);

    @Mapping(source = "pacientes", target = "pacientesId")
    @Mapping(source = "citas", target = "citasId")

    MedicoDTO medicoToMedicoDTO(Medico medico);

    @Mapping(source = "pacientesId", target = "pacientes")
    @Mapping(source = "citasId", target = "citas")
    Medico medicoDTOToMedico(MedicoDTO medicoDTO);
}




