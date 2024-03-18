package com.example.ParcticaMetaenlace_1.servicios;

import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;

import com.example.ParcticaMetaenlace_1.mapper.MedicoMapper;
import com.example.ParcticaMetaenlace_1.modelo.Medico;
import com.example.ParcticaMetaenlace_1.repositorios.MedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoServicio {

    @Autowired
    private MedicoRepositorio medicoRepositorio;

    @Autowired
    private MedicoMapper medicoMapper;

    public List<MedicoDTO> getAllMedicos() {
        List<Medico> medicos = medicoRepositorio.findAll();
        return medicos.stream()
                .map(medicoMapper::medicoToMedicoDTO)
                .collect(Collectors.toList());
    }

    public MedicoDTO getMedicoById(Long id) {
        Medico medico = medicoRepositorio.findById(id).orElse(null);
        return medico != null ? medicoMapper.medicoToMedicoDTO(medico) : null;
    }

    public MedicoDTO saveMedico(MedicoDTO medicoDTO) {
        Medico medico = medicoMapper.medicoDTOToMedico(medicoDTO);
        return medicoMapper.medicoToMedicoDTO(medicoRepositorio.save(medico));
    }

    public MedicoDTO updateMedico(Long id, MedicoDTO medicoDTO) {
        Medico existingMedico = medicoRepositorio.findById(id).orElse(null);
        if (existingMedico != null) {
            existingMedico.setNumColegiado(medicoDTO.getNumColegiado());
            existingMedico.setPacientes(medicoDTO.getPacientesId());
            existingMedico.setCitas(medicoDTO.getCitasId());
            return medicoMapper.medicoToMedicoDTO(medicoRepositorio.save(existingMedico));
        }
        return null;
    }

    public void deleteMedico(Long id) {
        if (medicoRepositorio.existsById(id)) {
            medicoRepositorio.deleteById(id);
        }
    }
}
