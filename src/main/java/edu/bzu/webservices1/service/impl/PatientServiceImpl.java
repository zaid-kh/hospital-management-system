package edu.bzu.webservices1.service.impl;

import edu.bzu.webservices1.repository.PatientRepository;
import edu.bzu.webservices1.service.PatientService;
import edu.bzu.webservices1.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient updatePatient(Patient patient, Long id) {
        patient.setId(id);
        return patientRepository.save(patient);
    }


    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

}
