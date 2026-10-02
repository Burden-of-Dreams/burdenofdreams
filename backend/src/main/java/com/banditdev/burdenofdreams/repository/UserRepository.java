package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
