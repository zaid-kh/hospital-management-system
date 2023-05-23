package edu.bzu.webservices1.service;

import edu.bzu.webservices1.entity.Doctor;

import java.util.List;
import java.util.Optional;

/***
 * {@code @Author:} Zaid Khamis
 */

public interface DoctorService {
    Doctor createDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Optional<Doctor> getDoctorById(Long id);

    Doctor updateDoctor(Doctor doctor, Long id);

    void deleteDoctor(Long id);
}
