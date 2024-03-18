package com.example.ParcticaMetaenlace_1.dto;




import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CitaDTO {

    private Long id;
    private Date fechaHora;
    private String motivoCita;
    private int attribute11;
    private Long pacienteId;
    private Long medicoId;
    private Long diagnosticoId;
}


