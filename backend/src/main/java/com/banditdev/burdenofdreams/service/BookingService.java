package com.banditdev.burdenofdreams.service;


import com.banditdev.burdenofdreams.model.system.Booking;
import com.banditdev.burdenofdreams.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        Optional<Booking> bookingOptional =bookingRepository.findById(id);
        if (bookingOptional.isEmpty()) {
            throw new RuntimeException("Booking not found. Id: " + id);
        }
        return bookingOptional.get();
    }

}
