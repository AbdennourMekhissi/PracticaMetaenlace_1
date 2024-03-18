package com.example.ParcticaMetaenlace_1.controladores;

import com.example.ParcticaMetaenlace_1.dto.CitaDTO;
import com.example.ParcticaMetaenlace_1.servicios.CitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaControlador {

    private final CitaServicio citaServicio;

    @Autowired
    public CitaControlador(CitaServicio citaServicio) {
        this.citaServicio = citaServicio;
    }

    @GetMapping
    public List<CitaDTO> getAllCitas() {
        return citaServicio.getAllCitas();
    }

    @GetMapping("/{id}")
    public CitaDTO getCitaById(@PathVariable Long id) {
        return citaServicio.getCitaById(id);
    }

    @PostMapping
    public CitaDTO createCita(@RequestBody CitaDTO citaDTO) {
        return citaServicio.saveCita(citaDTO);
    }

    @PutMapping("/{id}")
    public CitaDTO updateCita(@PathVariable Long id, @RequestBody CitaDTO citaDTO) {
        return citaServicio.updateCita(id, citaDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCita(@PathVariable Long id) {
        citaServicio.deleteCita(id);
    }
}
