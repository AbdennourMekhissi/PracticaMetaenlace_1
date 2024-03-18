package com.example.ParcticaMetaenlace_1.repositorios;


import com.example.ParcticaMetaenlace_1.modelo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente, Long> {
}
