package br.com.ero.airbnb_clone_backend.listing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {ListingPictureMapper.class})
public interface ListingMapper {
}