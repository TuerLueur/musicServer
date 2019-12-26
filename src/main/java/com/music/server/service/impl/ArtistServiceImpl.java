package com.music.server.service.impl;

import com.music.server.mapper.ArtistMapper;
import com.music.server.entity.Artist;
import com.music.server.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("ArtistService")
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    private ArtistMapper artistMapper;

    @Override
    public List<Artist> searchArtistByName(String name){
        System.out.println("ArtistServiceImpl");
        return artistMapper.searchArtistByName(name);
    }
}
