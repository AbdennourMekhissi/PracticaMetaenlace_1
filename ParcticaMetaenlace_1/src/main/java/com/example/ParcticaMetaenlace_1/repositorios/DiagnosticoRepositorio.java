package com.example.ParcticaMetaenlace_1.repositorios;

import com.example.ParcticaMetaenlace_1.modelo.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticoRepositorio extends JpaRepository<Diagnostico, Long> {
}
