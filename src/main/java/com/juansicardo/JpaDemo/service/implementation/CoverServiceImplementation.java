package com.juansicardo.JpaDemo.service.implementation;

import com.juansicardo.JpaDemo.entity.Cover;
import com.juansicardo.JpaDemo.repository.CoverRepository;
import com.juansicardo.JpaDemo.service.CoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverServiceImplementation implements CoverService {

    @Autowired
    CoverRepository coverRepository;

    @Override
    public List<Cover> getAllCovers() {
        return coverRepository.findAll();
    }

    @Override
    public Cover getCover(Integer id) {
        return coverRepository.findById(id).orElse(null);
    }

    @Override
    public String createCover(Cover cover) {
        if (coverRepository.existsById(cover.getIdCover()))
            return "Error: Cover already exists!";

        coverRepository.save(cover);
        return "Cover created successfully!";
    }

    @Override
    public String deleteCover(Integer id) {
        if (coverRepository.existsById(id)) {
            coverRepository.deleteById(id);
            return "Cover deleted successfully!";
        }

        return "Error: Cover doesn't exist!";
    }

    @Override
    public String deleteAllCovers() {
        coverRepository.deleteAll();
        return "All covers deleted successfully!";
    }

    @Override
    public String updateCover(Cover cover) {
        Integer id = cover.getIdCover();

        if (!coverRepository.existsById(id))
            return "Error: Cover doesn't exist!";

        coverRepository.save(cover);
        return "Cover updated successfully!";
    }
}
