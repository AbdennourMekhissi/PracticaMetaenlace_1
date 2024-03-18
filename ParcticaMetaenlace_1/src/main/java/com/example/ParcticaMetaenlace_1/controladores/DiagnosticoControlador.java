package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.DiagnosticoDTO;
import com.example.ParcticaMetaenlace_1.interfaces.DiagnosticoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoControlador {

    @Autowired
    private DiagnosticoInterfaz diagnosticoInterfaz;

    @GetMapping
    public List<DiagnosticoDTO> getAllDiagnosticos() {
        return diagnosticoInterfaz.getAllDiagnosticos();
    }

    @GetMapping("/{id}")
    public DiagnosticoDTO getDiagnosticoById(@PathVariable Long id) {
        return diagnosticoInterfaz.getDiagnosticoById(id);
    }

    @PostMapping
    public DiagnosticoDTO createDiagnostico(@RequestBody DiagnosticoDTO diagnosticoDTO) {
        return diagnosticoInterfaz.saveDiagnostico(diagnosticoDTO);
    }

    @PutMapping("/{id}")
    public DiagnosticoDTO updateDiagnostico(@PathVariable Long id, @RequestBody DiagnosticoDTO diagnosticoDTO) {
        return diagnosticoInterfaz.updateDiagnostico(id, diagnosticoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDiagnostico(@PathVariable Long id) {
        diagnosticoInterfaz.deleteDiagnostico(id);
    }
}
