package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.PacienteDTO;
import com.example.ParcticaMetaenlace_1.interfaces.PacienteInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    private PacienteInterfaz pacienteInterfaz;

    @GetMapping
    public List<PacienteDTO> getAllPacientes() {
        return pacienteInterfaz.getAllPacientes();
    }

    @GetMapping("/{id}")
    public PacienteDTO getPacienteById(@PathVariable Long id) {
        return pacienteInterfaz.getPacienteById(id);
    }

    @PostMapping
    public PacienteDTO createPaciente(@RequestBody PacienteDTO pacienteDTO) {
        return pacienteInterfaz.savePaciente(pacienteDTO);
    }

    @PutMapping("/{id}")
    public PacienteDTO updatePaciente(@PathVariable Long id, @RequestBody PacienteDTO pacienteDTO) {
        return pacienteInterfaz.updatePaciente(id, pacienteDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteInterfaz.deletePaciente(id);
    }
}
