package com.example.ParcticaMetaenlace_1.repositorios;

//clase jpa guarda emetodo(findByid...)
import com.example.ParcticaMetaenlace_1.modelo.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepositorio extends JpaRepository<Cita, Long> {
}
