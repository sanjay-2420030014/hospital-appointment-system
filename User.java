
package com.example.hospital.model;
import jakarta.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String role;

    public Long getId(){return id;}
    public String getUsername(){return username;}
    public void setUsername(String u){this.username=u;}
    public String getPassword(){return password;}
    public void setPassword(String p){this.password=p;}
    public String getRole(){return role;}
    public void setRole(String r){this.role=r;}
}
