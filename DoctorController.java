
package com.example.hospital.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.example.hospital.repo.DoctorRepo;
import com.example.hospital.model.Doctor;

@RestController
@CrossOrigin("*")
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorRepo repo;

    @PostMapping
    public Doctor add(@RequestBody Doctor d){ return repo.save(d); }

    @GetMapping
    public List<Doctor> all(){ return repo.findAll(); }
}
