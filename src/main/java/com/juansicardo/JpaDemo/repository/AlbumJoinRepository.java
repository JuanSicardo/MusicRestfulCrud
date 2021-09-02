package com.juansicardo.JpaDemo.repository;

import com.juansicardo.JpaDemo.entity.AlbumJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumJoinRepository extends JpaRepository<AlbumJoin, Integer> {
}
