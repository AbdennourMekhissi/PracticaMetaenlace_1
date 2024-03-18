package com.example.ParcticaMetaenlace_1.servicios;

import com.example.ParcticaMetaenlace_1.dto.DiagnosticoDTO;
import com.example.ParcticaMetaenlace_1.interfaces.DiagnosticoInterfaz;
import com.example.ParcticaMetaenlace_1.mapper.DiagnosticoMapper;

import com.example.ParcticaMetaenlace_1.modelo.Diagnostico;
import com.example.ParcticaMetaenlace_1.repositorios.DiagnosticoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiagnosticoServicio implements DiagnosticoInterfaz {

    @Autowired
    private DiagnosticoRepositorio diagnosticoRepositorio;

    @Autowired
    private DiagnosticoMapper diagnosticoMapper;

    public List<DiagnosticoDTO> getAllDiagnosticos() {
        List<Diagnostico> diagnosticos = diagnosticoRepositorio.findAll();
        return diagnosticos.stream()
                .map(diagnosticoMapper::diagnosticoToDiagnosticoDTO)
                .collect(Collectors.toList());
    }

    public DiagnosticoDTO getDiagnosticoById(Long id) {
        Diagnostico diagnostico = diagnosticoRepositorio.findById(id).orElse(null);
        return diagnostico != null ? diagnosticoMapper.diagnosticoToDiagnosticoDTO(diagnostico) : null;
    }

    public DiagnosticoDTO saveDiagnostico(DiagnosticoDTO diagnosticoDTO) {
        Diagnostico diagnostico = diagnosticoMapper.diagnosticoDTOToDiagnostico(diagnosticoDTO);
        diagnostico = diagnosticoRepositorio.save(diagnostico);
        return diagnosticoMapper.diagnosticoToDiagnosticoDTO(diagnostico);
    }

    public DiagnosticoDTO updateDiagnostico(Long id, DiagnosticoDTO diagnosticoDTO) {
        Diagnostico diagnosticoExistente = diagnosticoRepositorio.findById(id).orElse(null);
        if (diagnosticoExistente != null) {
            Diagnostico diagnostico = diagnosticoMapper.diagnosticoDTOToDiagnostico(diagnosticoDTO);
            diagnostico.setId(id);
            diagnostico = diagnosticoRepositorio.save(diagnostico);
            return diagnosticoMapper.diagnosticoToDiagnosticoDTO(diagnostico);
        }
        return null;
    }

    public void deleteDiagnostico(Long id) {
        if (diagnosticoRepositorio.existsById(id)) {
            diagnosticoRepositorio.deleteById(id);
        }
    }
}
