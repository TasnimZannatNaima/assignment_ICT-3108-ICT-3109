package com.it22001.medi_doctor.service;

import com.it22001.medi_doctor.model.Disease;
import com.it22001.medi_doctor.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseService {
    @Autowired
    private DiseaseRepository repo;

    public List<Disease> getAll() {
        return repo.findAll();
    }

    public Disease save(Disease d) {
        return repo.save(d);
    }

    public Disease getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
