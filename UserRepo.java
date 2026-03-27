
package com.example.hospital.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospital.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
    User findByUsernameAndPassword(String username,String password);
}
