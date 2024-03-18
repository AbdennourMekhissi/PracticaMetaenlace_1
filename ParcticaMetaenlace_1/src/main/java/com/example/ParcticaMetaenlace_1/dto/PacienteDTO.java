package com.example.ParcticaMetaenlace_1.dto;




import com.example.ParcticaMetaenlace_1.modelo.Cita;
import com.example.ParcticaMetaenlace_1.modelo.Medico;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PacienteDTO extends UsuarioDTO{
        private String NSS;
        private String numTarjeta;
        private String telefono;
        private String direccion;
        private ArrayList<Medico> medicos =new ArrayList<>();
        private ArrayList<Cita> citas  = new ArrayList<>();

    }


