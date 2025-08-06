package com.it22001.medi_doctor.repository;

import com.it22001.medi_doctor.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
