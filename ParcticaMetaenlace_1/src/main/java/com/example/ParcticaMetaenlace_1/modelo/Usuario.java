package com.example.ParcticaMetaenlace_1.modelo;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor//Esta anotación genera un constructor sin argumentos.
@AllArgsConstructor //Esta anotación genera un constructor con todos los argumentos
@ToString //Esta anotación genera automáticamente el método toString() para la clase
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Usuario")
public class Usuario {

    @Id
    //geberatevalue incrementa el id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String nombre;
    private String apellidos;
    private String clave;

}
