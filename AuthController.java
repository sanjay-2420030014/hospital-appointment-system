
package com.example.hospital.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.hospital.repo.UserRepo;
import com.example.hospital.model.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepo repo;

    @PostMapping("/register")
    public User register(@RequestBody User u){
        return repo.save(u);
    }

    @PostMapping("/login")
    public String login(@RequestBody User u){
        User user = repo.findByUsernameAndPassword(u.getUsername(),u.getPassword());
        if(user!=null) return "Login Success: "+user.getRole();
        return "Invalid";
    }
}
