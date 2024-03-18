package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.UsuarioDTO;
import com.example.ParcticaMetaenlace_1.modelo.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T10:59:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( usuario.getId() );
        usuarioDTO.setNombre( usuario.getNombre() );
        usuarioDTO.setApellidos( usuario.getApellidos() );
        usuarioDTO.setClave( usuario.getClave() );

        return usuarioDTO;
    }

    @Override
    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( usuarioDTO.getId() );
        usuario.setNombre( usuarioDTO.getNombre() );
        usuario.setApellidos( usuarioDTO.getApellidos() );
        usuario.setClave( usuarioDTO.getClave() );

        return usuario;
    }
}
