package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.PacienteDTO;
import com.example.ParcticaMetaenlace_1.servicios.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    private PacienteServicio pacienteServicio;

    @GetMapping
    public List<PacienteDTO> getAllPacientes() {
        return pacienteServicio.getAllPacientes();
    }

    @GetMapping("/{id}")
    public PacienteDTO getPacienteById(@PathVariable Long id) {
        return pacienteServicio.getPacienteById(id);
    }

    @PostMapping
    public PacienteDTO createPaciente(@RequestBody PacienteDTO pacienteDTO) {
        return pacienteServicio.savePaciente(pacienteDTO);
    }

    @PutMapping("/{id}")
    public PacienteDTO updatePaciente(@PathVariable Long id, @RequestBody PacienteDTO pacienteDTO) {
        return pacienteServicio.updatePaciente(id, pacienteDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteServicio.deletePaciente(id);
    }
}
