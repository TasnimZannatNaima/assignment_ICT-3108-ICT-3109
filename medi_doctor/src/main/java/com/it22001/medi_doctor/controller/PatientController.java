package com.it22001.medi_doctor.controller;

import com.it22001.medi_doctor.model.Patient;
import com.it22001.medi_doctor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService service;

    @GetMapping
    public List<Patient> allPatients() {
        return service.getAll();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return service.save(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient updated) {
        Patient p = service.getById(id);
        if (p != null) {
            p.setName(updated.getName());
            p.setAge(updated.getAge());
            p.setGender(updated.getGender());
            p.setMobileNumber(updated.getMobileNumber());
            return service.save(p);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        service.delete(id);
    }
}
