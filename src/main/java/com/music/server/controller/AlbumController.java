package com.music.server.controller;

import com.music.server.entity.Album;
import com.music.server.service.AlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@Slf4j
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping(value = "/searchAlbumByName")
    public List<Album> searchAlbumByName(String name){
        return albumService.searchAlbumByName(name);
    }

    @GetMapping(value = "/getAlbumByArtistId")
    public List<Album> getAlbumByArtistId(BigInteger aid){
        return albumService.getAlbumByArtistId(aid);
    }
}
