package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.DiagnosticoDTO;
import com.example.ParcticaMetaenlace_1.servicios.DiagnosticoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoControlador {

    @Autowired
    private DiagnosticoServicio diagnosticoServicio;

    @GetMapping
    public List<DiagnosticoDTO> getAllDiagnosticos() {
        return diagnosticoServicio.getAllDiagnosticos();
    }

    @GetMapping("/{id}")
    public DiagnosticoDTO getDiagnosticoById(@PathVariable Long id) {
        return diagnosticoServicio.getDiagnosticoById(id);
    }

    @PostMapping
    public DiagnosticoDTO createDiagnostico(@RequestBody DiagnosticoDTO diagnosticoDTO) {
        return diagnosticoServicio.saveDiagnostico(diagnosticoDTO);
    }

    @PutMapping("/{id}")
    public DiagnosticoDTO updateDiagnostico(@PathVariable Long id, @RequestBody DiagnosticoDTO diagnosticoDTO) {
        return diagnosticoServicio.updateDiagnostico(id, diagnosticoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDiagnostico(@PathVariable Long id) {
        diagnosticoServicio.deleteDiagnostico(id);
    }
}
