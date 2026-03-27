
package com.example.hospital.model;
import jakarta.persistence.*;

@Entity
public class Doctor {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String specialization;

    public Long getId(){return id;}
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public String getSpecialization(){return specialization;}
    public void setSpecialization(String s){this.specialization=s;}
}
