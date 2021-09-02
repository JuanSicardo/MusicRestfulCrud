package com.juansicardo.JpaDemo.service;

import com.juansicardo.JpaDemo.entity.Cover;

import java.util.List;

public interface CoverService {
    List<Cover> getAllCovers();

    Cover getCover(Integer id);

    String createCover(Cover cover);

    String deleteCover(Integer id);

    String deleteAllCovers();

    String updateCover(Cover cover);
}
