package com.example.ParcticaMetaenlace_1.modelo;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor//Esta anotación genera un constructor sin argumentos.
@AllArgsConstructor //Esta anotación genera un constructor con todos los argumentos
@ToString //Esta anotación genera automáticamente el método toString() para la clase
//@Builder
@Entity
@Table(name = "Diagnostico")
public class Diagnostico {
    @Id
    //geberatevalue incrementa el id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String valoracionEspecialista;
    private String enfermedad;


    @OneToOne
    @JoinColumn(name = "cita_id", unique = true)
    private Cita cita;
}
