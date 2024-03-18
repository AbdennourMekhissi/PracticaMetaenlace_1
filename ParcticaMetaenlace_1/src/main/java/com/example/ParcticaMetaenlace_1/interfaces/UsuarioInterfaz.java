package com.example.ParcticaMetaenlace_1.interfaces;

import com.example.ParcticaMetaenlace_1.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioInterfaz  {
    public List<UsuarioDTO> getAllUsuarios();
    public UsuarioDTO getUsuarioById(Long id);
    public UsuarioDTO saveUsuario(UsuarioDTO usuarioDTO);
    public UsuarioDTO updateUsuario(Long id, UsuarioDTO usuarioDTO);
    public void deleteUsuario(Long id);
}
