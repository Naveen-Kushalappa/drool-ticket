package com.local.drool.droolticket.service;

import com.local.drool.droolticket.domain.Patient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public interface DroolTicketService {

    Patient getPatientDetails(String patientId);

}
