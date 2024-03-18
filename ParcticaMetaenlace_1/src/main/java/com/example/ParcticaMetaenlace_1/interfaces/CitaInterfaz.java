package com.example.ParcticaMetaenlace_1.interfaces;

import com.example.ParcticaMetaenlace_1.dto.CitaDTO;

import java.util.List;

public interface CitaInterfaz {

    public List<CitaDTO> getAllCitas();
    public CitaDTO getCitaById(Long id);
    public CitaDTO saveCita(CitaDTO citaDTO);
    public CitaDTO updateCita(Long id, CitaDTO citaDTO);
    public void deleteCita(Long id);


}
