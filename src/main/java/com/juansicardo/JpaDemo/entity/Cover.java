package com.juansicardo.JpaDemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "cover")
public class Cover {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcover")
    Integer idCover;

    @Column(name = "coverartist")
    String coverArtist;

    @Column(name = "imagefile")
    String imageFile;
}
