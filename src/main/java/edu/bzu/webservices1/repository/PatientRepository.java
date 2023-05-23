package edu.bzu.webservices1.repository;

import edu.bzu.webservices1.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@code @Author:} Zaid Khamis
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
