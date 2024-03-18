package com.example.ParcticaMetaenlace_1.repositorios;

import com.example.ParcticaMetaenlace_1.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}

