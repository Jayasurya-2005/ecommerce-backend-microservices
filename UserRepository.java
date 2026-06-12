package com.user.module.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.user.module.entity.*;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
