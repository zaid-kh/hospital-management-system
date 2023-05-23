package edu.bzu.webservices1.repository;

import edu.bzu.webservices1.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@code @Author:} Zaid Khamis
 */
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
