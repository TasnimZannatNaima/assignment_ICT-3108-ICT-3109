package com.it22001.medi_doctor.service;

import com.it22001.medi_doctor.model.Patient;
import com.it22001.medi_doctor.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repo;

    public List<Patient> getAll() {
        return repo.findAll();
    }

    public Patient save(Patient p) {
        return repo.save(p);
    }

    public Patient getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
