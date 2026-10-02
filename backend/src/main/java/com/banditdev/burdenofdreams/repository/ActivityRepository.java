package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.system.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}