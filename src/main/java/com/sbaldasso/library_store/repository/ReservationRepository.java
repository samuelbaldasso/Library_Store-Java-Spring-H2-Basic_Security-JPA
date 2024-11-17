package com.sbaldasso.library_store.repository;

import com.sbaldasso.library_store.domain.Reservation;
import com.sbaldasso.library_store.domain.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByBookIdAndStatus(Long bookId, ReservationStatus reservationStatus);
}
