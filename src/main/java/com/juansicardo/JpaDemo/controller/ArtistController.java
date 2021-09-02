package com.juansicardo.JpaDemo.controller;

import com.juansicardo.JpaDemo.entity.Artist;
import com.juansicardo.JpaDemo.entity.ArtistJoin;
import com.juansicardo.JpaDemo.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping("")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("{id}")
    public Artist getArtist(@PathVariable("id") Integer id) {
        return artistService.getArtist(id);
    }

    @GetMapping("/join")
    public List<ArtistJoin> getArtistJoin() {
        return artistService.getArtistJoin();
    }

    @PostMapping("")
    public String createArtist(@RequestBody Artist artist) {
        return artistService.createArtist(artist);
    }

    @DeleteMapping("{id}")
    public String deleteArtist(@PathVariable("id") Integer id) {
        return artistService.deleteArtist(id);
    }

    @DeleteMapping("")
    public String deleteAllArtists() {
        return artistService.deleteAllArtists();
    }

    @PutMapping("")
    public String updateArtist(@RequestBody Artist artist) {
        return artistService.updateArtist(artist);
    }
}
