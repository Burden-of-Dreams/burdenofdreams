package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.system.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
