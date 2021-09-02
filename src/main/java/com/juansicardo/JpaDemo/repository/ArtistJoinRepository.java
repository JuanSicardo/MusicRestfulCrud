package com.juansicardo.JpaDemo.repository;

import com.juansicardo.JpaDemo.entity.ArtistJoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistJoinRepository extends JpaRepository<ArtistJoin, Integer> {
}
