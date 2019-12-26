package com.music.server.controller;


import com.music.server.entity.Artist;
import com.music.server.service.ArtistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping(value = "/searchArtistByName")
    public List<Artist> searchArtistByName(String name){
        System.out.println("ArtistController");
        return artistService.searchArtistByName(name);
    }
}
