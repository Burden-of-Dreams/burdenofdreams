package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.user.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
