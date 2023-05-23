package edu.bzu.webservices1.controller;

import edu.bzu.webservices1.entity.Doctor;
import edu.bzu.webservices1.exception.BadRequestException;
import edu.bzu.webservices1.exception.ResourceNotFoundException;
import edu.bzu.webservices1.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        try {
            return doctorService.createDoctor(doctor);
        } catch (Exception e) {
            throw new BadRequestException("Doctor", "id");
        }

    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable("id") Long id) {
        return doctorService.getDoctorById(id)
                .orElseThrow(() -> new RuntimeException("Doctor of id " + id + " not found"));
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable("id") Long id, @RequestBody Doctor doctor) {
        try {
            return doctorService.updateDoctor(doctor, id);
        } catch (BadRequestException e) {
            throw new BadRequestException("Doctor", "id");
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Doctor", "id", id);
        } catch (Exception e) {
            throw e;
        }
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable("id") Long id) {
        try {
            doctorService.deleteDoctor(id);
            return "Doctor of id " + id + " deleted successfully";
        } catch (Exception e) {
            throw new BadRequestException("Doctor", "id");
        }
    }
}
