package com.example.Infygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.Infygo.entity.TravelBooking;
import com.example.Infygo.repository.BookingRepository;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingRepository repo;

    // Create a booking
    @PostMapping
    public TravelBooking addBooking(@RequestBody TravelBooking booking) {
        return repo.save(booking);
    }

    // Get all bookings
    @GetMapping
    public List<TravelBooking> getAllBookings() {
        return repo.findAll();
    }
}