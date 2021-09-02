package com.juansicardo.JpaDemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idartist")
    Integer idArtist;

    @Column(name = "name")
    String name;

    @Column(name = "origin")
    String origin;

    @Column(name = "formation")
    Integer formation;

    @Column(name = "genre")
    String genre;
}
