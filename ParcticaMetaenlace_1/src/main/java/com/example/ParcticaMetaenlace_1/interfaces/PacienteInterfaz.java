package com.example.ParcticaMetaenlace_1.interfaces;

import com.example.ParcticaMetaenlace_1.dto.PacienteDTO;

import java.util.List;

public interface PacienteInterfaz {
    public List<PacienteDTO> getAllPacientes();
    public PacienteDTO getPacienteById(Long id);
    public PacienteDTO savePaciente(PacienteDTO pacienteDTO);
    public PacienteDTO updatePaciente(Long id, PacienteDTO pacienteDTO);
    public void deletePaciente(Long id);
}
