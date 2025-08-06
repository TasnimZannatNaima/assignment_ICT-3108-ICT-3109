package com.it22001.medi_doctor.controller;

import com.it22001.medi_doctor.model.Disease;
import com.it22001.medi_doctor.model.Patient;
import com.it22001.medi_doctor.service.DiseaseService;
import com.it22001.medi_doctor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diseases")
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private PatientService patientService;

    @PostMapping("/{patientId}")
    public Disease submitDisease(@PathVariable Long patientId, @RequestBody Disease disease) {
        Patient patient = patientService.getById(patientId);
        disease.setPatient(patient);

        // Dummy medicine suggestion (could be advanced later)
        String medicine = switch (disease.getDiseaseName().toLowerCase()) {
            case "fever" -> "Paracetamol";
            case "cough" -> "Benadryl";
            case "headache" -> "Aspirin";
            case "diabetes" -> "Insulin";
            case "cold" -> "Napa Extra";
            default -> "Consult Doctor";
        };
        disease.setMedicineSuggestion(medicine);

        return diseaseService.save(disease);
    }

    @GetMapping
    public List<Disease> getAllDiseases() {
        return diseaseService.getAll();
    }
}
