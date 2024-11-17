package com.sbaldasso.library_store.controller;

import com.sbaldasso.library_store.dto.ReservationDTO;
import com.sbaldasso.library_store.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ResponseEntity<ReservationDTO> createReservation(@RequestBody ReservationDTO reservationDTO) throws Exception {
        ReservationDTO newReservation = reservationService.createReservation(reservationDTO);
        return ResponseEntity.ok(newReservation);
    }

    @PutMapping("/{reservationId}/cancel")
    public ResponseEntity<ReservationDTO> cancelReservation(@PathVariable Long reservationId) throws Exception {
        ReservationDTO cancelledReservation = reservationService.cancelReservation(reservationId);
        return ResponseEntity.ok(cancelledReservation);
    }

}
