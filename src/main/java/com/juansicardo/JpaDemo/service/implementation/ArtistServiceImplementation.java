package com.juansicardo.JpaDemo.service.implementation;

import com.juansicardo.JpaDemo.entity.Artist;
import com.juansicardo.JpaDemo.entity.ArtistJoin;
import com.juansicardo.JpaDemo.repository.ArtistJoinRepository;
import com.juansicardo.JpaDemo.repository.ArtistRepository;
import com.juansicardo.JpaDemo.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImplementation implements ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    ArtistJoinRepository artistJoinRepository;

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist getArtist(Integer id) {
        return artistRepository.findById(id).orElse(null);
    }

    @Override
    public String createArtist(Artist artist) {
        if (artistRepository.existsById(artist.getIdArtist()))
            return "Error: Artist already exists!";

        artistRepository.save(artist);
        return "Artist created successfully!";
    }

    @Override
    public List<ArtistJoin> getArtistJoin() {
        return artistJoinRepository.findAll();
    }

    @Override
    public String deleteArtist(Integer id) {
        if (artistRepository.existsById(id)) {
            artistRepository.deleteById(id);
            return "Artist deleted successfully!";
        }

        return "Error: Artist doesn't exist!";
    }

    @Override
    public String deleteAllArtists() {
        artistRepository.deleteAll();
        return "All artists deleted successfully!";
    }

    @Override
    public String updateArtist(Artist artist) {
        Integer id = artist.getIdArtist();

        if (!artistRepository.existsById(id))
            return "Error: Artist doesn't exist!";

        artistRepository.save(artist);
        return "Artist updated successfully!";
    }
}
