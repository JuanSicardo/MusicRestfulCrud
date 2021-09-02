package com.juansicardo.JpaDemo.service;

import com.juansicardo.JpaDemo.entity.Album;
import com.juansicardo.JpaDemo.entity.AlbumJoin;

import java.util.List;

public interface AlbumService {
    List<Album> getAllAlbums();

    Album getAlbum(Integer id);

    String createAlbum(Album album);

    String deleteAlbum(Integer id);

    String deleteAllAlbums();

    String updateAlbum(Album album);

    List<AlbumJoin> getAlbumJoin();
}
