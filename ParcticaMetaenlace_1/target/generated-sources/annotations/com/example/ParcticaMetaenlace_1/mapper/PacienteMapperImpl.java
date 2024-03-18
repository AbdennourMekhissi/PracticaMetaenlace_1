package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.PacienteDTO;
import com.example.ParcticaMetaenlace_1.modelo.Cita;
import com.example.ParcticaMetaenlace_1.modelo.Medico;
import com.example.ParcticaMetaenlace_1.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T13:30:12+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public PacienteDTO pacienteToPacienteDTO(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();

        List<Medico> list = paciente.getMedicos();
        if ( list != null ) {
            pacienteDTO.setMedicos( new ArrayList<Medico>( list ) );
        }
        List<Cita> list1 = paciente.getCitasPaciente();
        if ( list1 != null ) {
            pacienteDTO.setCitas( new ArrayList<Cita>( list1 ) );
        }
        pacienteDTO.setId( paciente.getId() );
        pacienteDTO.setNombre( paciente.getNombre() );
        pacienteDTO.setApellidos( paciente.getApellidos() );
        pacienteDTO.setClave( paciente.getClave() );
        pacienteDTO.setNSS( paciente.getNSS() );
        pacienteDTO.setNumTarjeta( paciente.getNumTarjeta() );
        pacienteDTO.setTelefono( paciente.getTelefono() );
        pacienteDTO.setDireccion( paciente.getDireccion() );

        return pacienteDTO;
    }

    @Override
    public Paciente pacienteDTOToPaciente(PacienteDTO pacienteDTO) {
        if ( pacienteDTO == null ) {
            return null;
        }

        Paciente paciente = new Paciente();

        ArrayList<Medico> arrayList = pacienteDTO.getMedicos();
        if ( arrayList != null ) {
            paciente.setMedicos( new ArrayList<Medico>( arrayList ) );
        }
        ArrayList<Cita> arrayList1 = pacienteDTO.getCitas();
        if ( arrayList1 != null ) {
            paciente.setCitasPaciente( new ArrayList<Cita>( arrayList1 ) );
        }
        paciente.setId( pacienteDTO.getId() );
        paciente.setNombre( pacienteDTO.getNombre() );
        paciente.setApellidos( pacienteDTO.getApellidos() );
        paciente.setClave( pacienteDTO.getClave() );
        paciente.setNSS( pacienteDTO.getNSS() );
        paciente.setNumTarjeta( pacienteDTO.getNumTarjeta() );
        paciente.setTelefono( pacienteDTO.getTelefono() );
        paciente.setDireccion( pacienteDTO.getDireccion() );

        return paciente;
    }
}
