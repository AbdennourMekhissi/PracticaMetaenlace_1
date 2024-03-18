package com.example.ParcticaMetaenlace_1.servicios;

import com.example.ParcticaMetaenlace_1.dto.PacienteDTO;
import com.example.ParcticaMetaenlace_1.interfaces.PacienteInterfaz;
import com.example.ParcticaMetaenlace_1.mapper.PacienteMapper;
import com.example.ParcticaMetaenlace_1.modelo.Paciente;
import com.example.ParcticaMetaenlace_1.repositorios.PacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteServicio implements PacienteInterfaz {

    @Autowired
    private PacienteRepositorio pacienteRepositorio;

    @Autowired
    private PacienteMapper pacienteMapper;

    public List<PacienteDTO> getAllPacientes() {
        List<Paciente> pacientes = pacienteRepositorio.findAll();
        return pacientes.stream()
                .map(pacienteMapper::pacienteToPacienteDTO)
                .collect(Collectors.toList());
    }

    public PacienteDTO getPacienteById(Long id) {
        Paciente paciente = pacienteRepositorio.findById(id).orElse(null);
        return paciente != null ? pacienteMapper.pacienteToPacienteDTO(paciente) : null;
    }

    public PacienteDTO savePaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = pacienteMapper.pacienteDTOToPaciente(pacienteDTO);
        return pacienteMapper.pacienteToPacienteDTO(pacienteRepositorio.save(paciente));
    }

    public PacienteDTO updatePaciente(Long id, PacienteDTO pacienteDTO) {
        Paciente existingPaciente = pacienteRepositorio.findById(id).orElse(null);
        if (existingPaciente != null) {

            existingPaciente.setNSS(pacienteDTO.getNSS());
            existingPaciente.setNumTarjeta(pacienteDTO.getNumTarjeta());
            existingPaciente.setTelefono(pacienteDTO.getTelefono());
            existingPaciente.setDireccion(pacienteDTO.getDireccion());
            existingPaciente.setCitasPaciente(pacienteDTO.getCitas());
            existingPaciente.setMedicos(pacienteDTO.getMedicos());
            return pacienteMapper.pacienteToPacienteDTO(pacienteRepositorio.save(existingPaciente));
        }
        return null;
    }

    public void deletePaciente(Long id) {
        if (pacienteRepositorio.existsById(id)) {
            pacienteRepositorio.deleteById(id);
        }
    }
}
