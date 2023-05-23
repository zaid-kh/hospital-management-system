package edu.bzu.webservices1.service;

import edu.bzu.webservices1.entity.Patient;

import java.util.List;
import java.util.Optional;

/***
 * {@code @Author:} Zaid Khamis
 */
public interface PatientService {
    Patient createPatient(Patient patient);

    List<Patient> getAllPatients();

    Optional<Patient> getPatientById(Long id);

    Patient updatePatient(Patient patient, Long id);

    void deletePatient(Long id);

}
