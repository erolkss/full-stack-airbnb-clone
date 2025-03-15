package br.com.ero.airbnb_clone_backend.listing.repository;

import br.com.ero.airbnb_clone_backend.listing.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
