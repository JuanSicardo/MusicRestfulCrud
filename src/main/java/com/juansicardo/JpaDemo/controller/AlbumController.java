package com.juansicardo.JpaDemo.controller;

import com.juansicardo.JpaDemo.entity.Album;
import com.juansicardo.JpaDemo.entity.AlbumJoin;
import com.juansicardo.JpaDemo.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("album")
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping("")
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @GetMapping("{id}")
    public Album getAlbum(@PathVariable("id") Integer id) {
        return albumService.getAlbum(id);
    }

    @GetMapping("join")
    public List<AlbumJoin> getAlbumJoin() {
        return albumService.getAlbumJoin();
    }

    @PostMapping("")
    public String createAlbum(@RequestBody Album album) {
        return albumService.createAlbum(album);
    }

    @DeleteMapping("{id}")
    public String deleteAlbum(@PathVariable("id") Integer id) {
        return albumService.deleteAlbum(id);
    }

    @DeleteMapping("")
    public String deleteAllAlbums() {
        return albumService.deleteAllAlbums();
    }

    @PutMapping("")
    public String updateAlbum(@RequestBody Album album) {
        return albumService.updateAlbum(album);
    }
}
