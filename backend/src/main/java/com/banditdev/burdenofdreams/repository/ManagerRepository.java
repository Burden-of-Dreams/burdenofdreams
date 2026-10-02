package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.user.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
