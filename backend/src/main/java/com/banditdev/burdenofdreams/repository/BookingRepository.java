package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.system.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
