package com.example.ParcticaMetaenlace_1.repositorios;


import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;
import com.example.ParcticaMetaenlace_1.modelo.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, Long> {
}

