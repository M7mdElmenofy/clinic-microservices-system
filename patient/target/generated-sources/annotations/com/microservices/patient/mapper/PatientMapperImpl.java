package com.microservices.patient.mapper;

import com.microservices.patient.model.dto.patientdto.AddPatientDTO;
import com.microservices.patient.model.dto.patientdto.PatientDto;
import com.microservices.patient.model.dto.patientdto.PatientDto.PatientDtoBuilder;
import com.microservices.patient.model.dto.patientdto.UpdatePatientDTO;
import com.microservices.patient.model.entity.Patient;
import com.microservices.patient.model.entity.Patient.PatientBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-10T03:29:10+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toEntity(PatientDto patientDto) {
        if ( patientDto == null ) {
            return null;
        }

        PatientBuilder patient = Patient.builder();

        patient.id( patientDto.getId() );
        patient.patientName( patientDto.getPatientName() );
        patient.patientAge( patientDto.getPatientAge() );

        return patient.build();
    }

    @Override
    public PatientDto toDto(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDtoBuilder patientDto = PatientDto.builder();

        patientDto.id( patient.getId() );
        patientDto.patientName( patient.getPatientName() );
        patientDto.patientAge( patient.getPatientAge() );

        return patientDto.build();
    }

    @Override
    public Patient updateToEntity(UpdatePatientDTO updatePatientDTO) {
        if ( updatePatientDTO == null ) {
            return null;
        }

        PatientBuilder patient = Patient.builder();

        patient.id( updatePatientDTO.getId() );
        patient.patientName( updatePatientDTO.getPatientName() );
        patient.patientAge( updatePatientDTO.getPatientAge() );

        return patient.build();
    }

    @Override
    public Patient addToEntity(AddPatientDTO addPatientDTO) {
        if ( addPatientDTO == null ) {
            return null;
        }

        PatientBuilder patient = Patient.builder();

        patient.patientName( addPatientDTO.getPatientName() );
        patient.patientAge( addPatientDTO.getPatientAge() );

        return patient.build();
    }
}
