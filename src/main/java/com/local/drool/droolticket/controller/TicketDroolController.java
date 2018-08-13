package com.local.drool.droolticket.controller;

import com.local.drool.droolticket.domain.Patient;
import com.local.drool.droolticket.service.DroolTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketDroolController {

    @Autowired
    private DroolTicketService droolTicketService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Patient getPatient(@RequestParam(required = true) String patientId) {

        return droolTicketService.getPatientDetails(patientId);

    }

} 
