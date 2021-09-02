package com.juansicardo.JpaDemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalbum")
    Integer idAlbum;

    @Column(name = "artist")
    Integer artist;

    @Column(name = "cover")
    Integer cover;

    @Column(name = "title")
    String title;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "releasedate")
    Date releaseDate;

    @Column(name = "label")
    String label;

    @Column(name = "trackcount")
    Integer trackCount;
}
