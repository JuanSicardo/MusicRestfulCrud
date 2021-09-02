package com.juansicardo.JpaDemo.service;

import com.juansicardo.JpaDemo.entity.Artist;
import com.juansicardo.JpaDemo.entity.ArtistJoin;

import java.util.List;

public interface ArtistService {
    List<Artist> getAllArtists();

    Artist getArtist(Integer id);

    String createArtist(Artist artist);

    String deleteArtist(Integer id);

    String deleteAllArtists();

    String updateArtist(Artist artist);

    List<ArtistJoin> getArtistJoin();
}
