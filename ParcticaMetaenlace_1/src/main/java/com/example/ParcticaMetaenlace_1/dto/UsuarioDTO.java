package com.example.ParcticaMetaenlace_1.dto;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private String clave;
}
