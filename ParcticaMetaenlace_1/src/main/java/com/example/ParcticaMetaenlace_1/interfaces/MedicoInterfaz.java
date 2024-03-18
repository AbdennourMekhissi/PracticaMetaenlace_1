package com.example.ParcticaMetaenlace_1.interfaces;

import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;

import java.util.List;

public interface MedicoInterfaz {
    public List<MedicoDTO> getAllMedicos();
    public MedicoDTO getMedicoById(Long id);
    public MedicoDTO saveMedico(MedicoDTO medicoDTO);
    public MedicoDTO updateMedico(Long id, MedicoDTO medicoDTO);
    public void deleteMedico(Long id);
}
