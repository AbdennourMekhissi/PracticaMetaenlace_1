package com.example.ParcticaMetaenlace_1.controladores;


import com.example.ParcticaMetaenlace_1.dto.CitaDTO;
import com.example.ParcticaMetaenlace_1.servicios.CitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<CitaDTO>> getAllCitas() {
        List<CitaDTO> citas = citaServicio.getAllCitas();
        return ResponseEntity.ok(citas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CitaDTO> getCitaById(@PathVariable Long id) {
        CitaDTO cita = citaServicio.getCitaById(id);
        if (cita != null) {
            return ResponseEntity.ok(cita);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<CitaDTO> createCita(@RequestBody CitaDTO citaDTO) {
        CitaDTO createdCita = citaServicio.saveCita(citaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCita);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CitaDTO> updateCita(@PathVariable Long id, @RequestBody CitaDTO citaDTO) {
        CitaDTO updatedCita = citaServicio.updateCita(id, citaDTO);
        if (updatedCita != null) {
            return ResponseEntity.ok(updatedCita);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCita(@PathVariable Long id) {
        citaServicio.deleteCita(id);
        return ResponseEntity.noContent().build();
    }
}
