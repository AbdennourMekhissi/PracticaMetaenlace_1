package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;
import com.example.ParcticaMetaenlace_1.servicios.MedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {

    @Autowired
    private MedicoServicio medicoServicio;

    @GetMapping
    public List<MedicoDTO> getAllMedicos() {
        return medicoServicio.getAllMedicos();
    }

    @GetMapping("/{id}")
    public MedicoDTO getMedicoById(@PathVariable Long id) {
        return medicoServicio.getMedicoById(id);
    }

    @PostMapping
    public MedicoDTO createMedico(@RequestBody MedicoDTO medicoDTO) {
        return medicoServicio.saveMedico(medicoDTO);
    }

    @PutMapping("/{id}")
    public MedicoDTO updateMedico(@PathVariable Long id, @RequestBody MedicoDTO medicoDTO) {
        return medicoServicio.updateMedico(id, medicoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteMedico(@PathVariable Long id) {
        medicoServicio.deleteMedico(id);
    }
}
