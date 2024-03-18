package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.UsuarioDTO;
import com.example.ParcticaMetaenlace_1.interfaces.UsuarioInterfaz;
import com.example.ParcticaMetaenlace_1.servicios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioInterfaz usuarioInterfaz;

    @GetMapping
    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioInterfaz.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDTO getUsuarioById(@PathVariable Long id) {
        return usuarioInterfaz.getUsuarioById(id);
    }

    @PostMapping
    public UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioInterfaz.saveUsuario(usuarioDTO);
    }

    @PutMapping("/{id}")
    public UsuarioDTO updateUsuario(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioInterfaz.updateUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioInterfaz.deleteUsuario(id);
    }
}
