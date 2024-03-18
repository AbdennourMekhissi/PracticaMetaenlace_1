package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;
import com.example.ParcticaMetaenlace_1.interfaces.MedicoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {

    @Autowired
    private MedicoInterfaz medicoInterfaz;

    @GetMapping
    public List<MedicoDTO> getAllMedicos() {
        return medicoInterfaz.getAllMedicos();
    }

    @GetMapping("/{id}")
    public MedicoDTO getMedicoById(@PathVariable Long id) {
        return medicoInterfaz.getMedicoById(id);
    }

    @PostMapping
    public MedicoDTO createMedico(@RequestBody MedicoDTO medicoDTO) {
        return medicoInterfaz.saveMedico(medicoDTO);
    }

    @PutMapping("/{id}")
    public MedicoDTO updateMedico(@PathVariable Long id, @RequestBody MedicoDTO medicoDTO) {
        return medicoInterfaz.updateMedico(id, medicoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteMedico(@PathVariable Long id) {
        medicoInterfaz.deleteMedico(id);
    }
}
