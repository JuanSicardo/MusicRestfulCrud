package com.juansicardo.JpaDemo.controller;

import com.juansicardo.JpaDemo.entity.Cover;
import com.juansicardo.JpaDemo.service.CoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cover")
public class CoverController {

    @Autowired
    CoverService coverService;

    @GetMapping("")
    public List<Cover> getAllCovers() {
        return coverService.getAllCovers();
    }

    @GetMapping("{id}")
    public Cover getCover(@PathVariable("id") Integer id) {
        return coverService.getCover(id);
    }

    @PostMapping("")
    public String createCover(@RequestBody Cover cover) {
        return coverService.createCover(cover);
    }

    @DeleteMapping("{id}")
    public String deleteCover(@PathVariable("id") Integer id) {
        return coverService.deleteCover(id);
    }

    @DeleteMapping("")
    public String deleteAllCovers() {
        return coverService.deleteAllCovers();
    }

    @PutMapping("")
    public String updateCover(@RequestBody Cover cover) {
        return coverService.updateCover(cover);
    }
}
