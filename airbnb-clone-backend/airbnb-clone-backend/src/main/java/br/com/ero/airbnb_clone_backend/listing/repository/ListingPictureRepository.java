package br.com.ero.airbnb_clone_backend.listing.repository;

import br.com.ero.airbnb_clone_backend.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
