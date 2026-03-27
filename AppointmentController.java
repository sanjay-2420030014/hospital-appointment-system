
package com.example.hospital.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.example.hospital.repo.AppointmentRepo;
import com.example.hospital.model.Appointment;

@RestController
@CrossOrigin("*")
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentRepo repo;

    @PostMapping
    public Appointment book(@RequestBody Appointment a){ return repo.save(a); }

    @GetMapping
    public List<Appointment> all(){ return repo.findAll(); }
}
