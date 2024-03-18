package com.example.ParcticaMetaenlace_1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor//Esta anotación genera un constructor sin argumentos.
@AllArgsConstructor //Esta anotación genera un constructor con todos los argumentos
@ToString //Esta anotación genera automáticamente el método toString() para la clase
//@Builder
@Entity
@Table(name = "Medico")
public class Medico  extends Usuario{

    private String numColegiado;


    //Relacion de N a N(Paciente-Medico)

    @ManyToMany(mappedBy = "medicos")
    List<Paciente> pacientes;

    //Relacion de 1 a N(Cita-Medico)
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Cita> citas;

}
