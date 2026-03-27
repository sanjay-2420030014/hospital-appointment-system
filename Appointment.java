
package com.example.hospital.model;
import jakarta.persistence.*;

@Entity
public class Appointment {
    @Id @GeneratedValue
    private Long id;
    private Long userId;
    private Long doctorId;
    private String date;

    public Long getId(){return id;}
    public Long getUserId(){return userId;}
    public void setUserId(Long u){this.userId=u;}
    public Long getDoctorId(){return doctorId;}
    public void setDoctorId(Long d){this.doctorId=d;}
    public String getDate(){return date;}
    public void setDate(String d){this.date=d;}
}
