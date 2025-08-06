package com.it22001.medi_doctor.model;

import jakarta.persistence.*;

@Entity
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diseaseName;
    private String medicineSuggestion;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // ✅ Getter & Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Getter & Setter for diseaseName
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    // ✅ Getter & Setter for medicineSuggestion
    public String getMedicineSuggestion() {
        return medicineSuggestion;
    }

    public void setMedicineSuggestion(String medicineSuggestion) {
        this.medicineSuggestion = medicineSuggestion;
    }

    // ✅ Getter & Setter for patient
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

