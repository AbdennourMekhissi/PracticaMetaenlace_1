package com.example.ParcticaMetaenlace_1.dto;

import com.example.ParcticaMetaenlace_1.modelo.Cita;
import com.example.ParcticaMetaenlace_1.modelo.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class MedicoDTO extends UsuarioDTO{


    private String numColegiado;
    private ArrayList<Paciente> pacientesId = new ArrayList<>();
    private ArrayList<Cita> citasId = new ArrayList<>();

}
