package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.UsuarioDTO;
import com.example.ParcticaMetaenlace_1.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioServicio.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDTO getUsuarioById(@PathVariable Long id) {
        return usuarioServicio.getUsuarioById(id);
    }

    @PostMapping
    public UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioServicio.saveUsuario(usuarioDTO);
    }

    @PutMapping("/{id}")
    public UsuarioDTO updateUsuario(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioServicio.updateUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioServicio.deleteUsuario(id);
    }
}
