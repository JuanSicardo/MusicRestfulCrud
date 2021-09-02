package com.juansicardo.JpaDemo.repository;

import com.juansicardo.JpaDemo.entity.Cover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverRepository extends JpaRepository<Cover, Integer> {
}
