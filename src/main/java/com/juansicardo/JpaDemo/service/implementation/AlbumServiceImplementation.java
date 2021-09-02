package com.juansicardo.JpaDemo.service.implementation;

import com.juansicardo.JpaDemo.entity.Album;
import com.juansicardo.JpaDemo.entity.AlbumJoin;
import com.juansicardo.JpaDemo.repository.AlbumJoinRepository;
import com.juansicardo.JpaDemo.repository.AlbumRepository;
import com.juansicardo.JpaDemo.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class AlbumServiceImplementation implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private AlbumJoinRepository albumJoinRepository;


    @Override
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public Album getAlbum(Integer id) {
        return albumRepository.findById(id).orElse(null);
    }

    @Override
    public List<AlbumJoin> getAlbumJoin() {
        return albumJoinRepository.findAll();
    }

    @Override
    public String createAlbum(Album album) {
        if (albumRepository.existsById(album.getIdAlbum()))
            return "Error: Album already exists!";

        albumRepository.save(album);
        return "Album created successfully!";
    }

    @Override
    public String deleteAlbum(Integer id) {
        if (albumRepository.existsById(id)) {
            albumRepository.deleteById(id);
            return "Album deleted successfully!";
        }

        return "Error: Album doesn't exist!";
    }

    @Override
    public String deleteAllAlbums() {
        albumRepository.deleteAll();
        return "All albums deleted successfully!";
    }

    @Override
    public String updateAlbum(Album album) {
        Integer id = album.getIdAlbum();

        if (!albumRepository.existsById(id))
            return "Error: Album doesn't exist!";

        albumRepository.save(album);
        return "Album updated successfully!";
    }
}
