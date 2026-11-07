package com.example.Infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Infygo.entity.TravelBooking;

public interface BookingRepository extends JpaRepository<TravelBooking, Long> {
}