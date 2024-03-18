package com.example.ParcticaMetaenlace_1.interfaces;

import com.example.ParcticaMetaenlace_1.dto.DiagnosticoDTO;

import java.util.List;

public interface DiagnosticoInterfaz {
    public List<DiagnosticoDTO> getAllDiagnosticos();
    public DiagnosticoDTO getDiagnosticoById(Long id);
    public DiagnosticoDTO saveDiagnostico(DiagnosticoDTO diagnosticoDTO);
    public DiagnosticoDTO updateDiagnostico(Long id, DiagnosticoDTO diagnosticoDTO);
    public void deleteDiagnostico(Long id);
}
