package br.com.ero.airbnb_clone_backend.booking.repository;

import br.com.ero.airbnb_clone_backend.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
