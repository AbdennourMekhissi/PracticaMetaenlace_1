package com.example.ParcticaMetaenlace_1.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
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
@Table(name = "Paciente")
public class Paciente extends Usuario{

    private String NSS;
    private String numTarjeta;
    private String telefono;
    private String direccion;

    //Relacion de N a N(Paciente-Medico)

    @ManyToMany
    @JoinTable(
            name = "paciente_medico",
            joinColumns = @JoinColumn(name = "paciente_id"),
            inverseJoinColumns = @JoinColumn(name = "medico_id")
    )
    List<Medico> medicos;


    //Relacion de 1 a N (Paciente-Cita)

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    List<Cita> citasPaciente;


}
