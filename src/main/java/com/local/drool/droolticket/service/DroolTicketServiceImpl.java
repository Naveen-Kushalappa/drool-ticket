package com.local.drool.droolticket.service;

import com.local.drool.droolticket.domain.Patient;
import com.local.drool.droolticket.repository.PatientRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("droolTicketService")
public class DroolTicketServiceImpl implements DroolTicketService {

    @Autowired
    private PatientRepository patientRepository;

    private final KieContainer kieContainer;
    @Autowired
    public DroolTicketServiceImpl(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public Patient getPatientDetails(String patientId) {

        Optional<Patient> patient = patientRepository.findById(Integer.valueOf(patientId));

        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(patient.get());
        kieSession.fireAllRules();
        kieSession.dispose();



        return patient.get();
    }
}
