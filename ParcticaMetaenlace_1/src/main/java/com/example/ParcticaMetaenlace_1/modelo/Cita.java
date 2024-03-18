package com.example.ParcticaMetaenlace_1.modelo;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@NoArgsConstructor//Esta anotación genera un constructor sin argumentos.
@AllArgsConstructor //Esta anotación genera un constructor con todos los argumentos
@ToString //Esta anotación genera automáticamente el método toString() para la clase
//@Builder
@Entity
@Table(name = "Cita")
public class Cita {
    @Id
    //geberatevalue incrementa el id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @CreationTimestamp//actualiza la base de datos cada vez que se realize un cambio
    @Temporal(TemporalType.TIMESTAMP)//indicar que se debe de mapear conun tipo fecha
    private Date fechaHora;
    private String motivoCita;
    private int attribute11;


    //Relacion de 1 a N (Cita-Paciente)
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;


    //Relacion 1 a N (Cita-Medico)
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    //Relacion 1 a 1(Cita-Diagnostico)
    @OneToOne(mappedBy = "cita", cascade = CascadeType.ALL)
    private Diagnostico diagnostico;

}
