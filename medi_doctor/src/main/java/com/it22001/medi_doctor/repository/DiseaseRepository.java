package com.it22001.medi_doctor.repository;

import com.it22001.medi_doctor.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease, Long> {
}

