package com.example.ParcticaMetaenlace_1.servicios;

import com.example.ParcticaMetaenlace_1.dto.UsuarioDTO;
import com.example.ParcticaMetaenlace_1.interfaces.UsuarioInterfaz;
import com.example.ParcticaMetaenlace_1.mapper.UsuarioMapper;
import com.example.ParcticaMetaenlace_1.modelo.Usuario;
import com.example.ParcticaMetaenlace_1.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServicio implements UsuarioInterfaz {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepositorio.findAll();
        return usuarios.stream()
                .map(usuarioMapper::usuarioToUsuarioDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO getUsuarioById(Long id) {
        Usuario usuario = usuarioRepositorio.findById(id).orElse(null);
        return usuario != null ? usuarioMapper.usuarioToUsuarioDTO(usuario) : null;
    }

    public UsuarioDTO saveUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.usuarioDTOToUsuario(usuarioDTO);
        return usuarioMapper.usuarioToUsuarioDTO(usuarioRepositorio.save(usuario));
    }

    public UsuarioDTO updateUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario existingUsuario = usuarioRepositorio.findById(id).orElse(null);
        if (existingUsuario != null) {
            existingUsuario.setNombre(usuarioDTO.getNombre());
            existingUsuario.setApellidos(usuarioDTO.getApellidos());
            existingUsuario.setClave(usuarioDTO.getClave());
            return usuarioMapper.usuarioToUsuarioDTO(usuarioRepositorio.save(existingUsuario));
        }
        return null;
    }

    public void deleteUsuario(Long id) {
        if (usuarioRepositorio.existsById(id)) {
            usuarioRepositorio.deleteById(id);
        }
    }
}
