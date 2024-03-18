package com.example.ParcticaMetaenlace_1.servicios;

import com.example.ParcticaMetaenlace_1.dto.CitaDTO;
import com.example.ParcticaMetaenlace_1.mapper.CitaMapper;
import com.example.ParcticaMetaenlace_1.modelo.Cita;
import com.example.ParcticaMetaenlace_1.repositorios.CitaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CitaServicio {

    private final CitaRepositorio citaRepositorio;
    private final CitaMapper citaMapper;

    @Autowired
    public CitaServicio(CitaRepositorio citaRepositorio, CitaMapper citaMapper) {
        this.citaRepositorio = citaRepositorio;
        this.citaMapper = citaMapper;
    }

    public List<CitaDTO> getAllCitas() {
        List<Cita> citas = citaRepositorio.findAll();
        return citas.stream()
                .map(citaMapper::citaToCitaDTO)
                .collect(Collectors.toList());
    }

    public CitaDTO getCitaById(Long id) {
        Cita cita = citaRepositorio.findById(id).orElse(null);
        return cita != null ? citaMapper.citaToCitaDTO(cita) : null;
    }

    public CitaDTO saveCita(CitaDTO citaDTO) {
        Cita cita = citaMapper.citaDTOToCita(citaDTO);
        return citaMapper.citaToCitaDTO(citaRepositorio.save(cita));
    }

    public CitaDTO updateCita(Long id, CitaDTO citaDTO) {
        Cita existingCita = citaRepositorio.findById(id).orElse(null);
        if (existingCita != null) {
            existingCita.setFechaHora(citaDTO.getFechaHora());
            existingCita.setMotivoCita(citaDTO.getMotivoCita());
            existingCita.setAttribute11(citaDTO.getAttribute11());
            return citaMapper.citaToCitaDTO(citaRepositorio.save(existingCita));
        }
        return null;
    }

    public void deleteCita(Long id) {
        if (citaRepositorio.existsById(id)) {
            citaRepositorio.deleteById(id);
        }
    }
}
