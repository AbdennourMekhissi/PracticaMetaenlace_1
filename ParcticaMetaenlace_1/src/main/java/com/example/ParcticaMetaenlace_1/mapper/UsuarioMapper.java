package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.UsuarioDTO;
import com.example.ParcticaMetaenlace_1.modelo.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellidos", target = "apellidos")
    @Mapping(source = "clave", target = "clave")
    UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellidos", target = "apellidos")
    @Mapping(source = "clave", target = "clave")
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}
