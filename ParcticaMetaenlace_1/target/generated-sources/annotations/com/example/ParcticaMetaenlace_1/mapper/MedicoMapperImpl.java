package com.example.ParcticaMetaenlace_1.mapper;

import com.example.ParcticaMetaenlace_1.dto.MedicoDTO;
import com.example.ParcticaMetaenlace_1.modelo.Cita;
import com.example.ParcticaMetaenlace_1.modelo.Medico;
import com.example.ParcticaMetaenlace_1.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T13:30:11+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class MedicoMapperImpl implements MedicoMapper {

    @Override
    public MedicoDTO medicoToMedicoDTO(Medico medico) {
        if ( medico == null ) {
            return null;
        }

        MedicoDTO medicoDTO = new MedicoDTO();

        List<Paciente> list = medico.getPacientes();
        if ( list != null ) {
            medicoDTO.setPacientesId( new ArrayList<Paciente>( list ) );
        }
        List<Cita> list1 = medico.getCitas();
        if ( list1 != null ) {
            medicoDTO.setCitasId( new ArrayList<Cita>( list1 ) );
        }
        medicoDTO.setId( medico.getId() );
        medicoDTO.setNombre( medico.getNombre() );
        medicoDTO.setApellidos( medico.getApellidos() );
        medicoDTO.setClave( medico.getClave() );
        medicoDTO.setNumColegiado( medico.getNumColegiado() );

        return medicoDTO;
    }

    @Override
    public Medico medicoDTOToMedico(MedicoDTO medicoDTO) {
        if ( medicoDTO == null ) {
            return null;
        }

        Medico medico = new Medico();

        ArrayList<Paciente> arrayList = medicoDTO.getPacientesId();
        if ( arrayList != null ) {
            medico.setPacientes( new ArrayList<Paciente>( arrayList ) );
        }
        ArrayList<Cita> arrayList1 = medicoDTO.getCitasId();
        if ( arrayList1 != null ) {
            medico.setCitas( new ArrayList<Cita>( arrayList1 ) );
        }
        medico.setId( medicoDTO.getId() );
        medico.setNombre( medicoDTO.getNombre() );
        medico.setApellidos( medicoDTO.getApellidos() );
        medico.setClave( medicoDTO.getClave() );
        medico.setNumColegiado( medicoDTO.getNumColegiado() );

        return medico;
    }
}
