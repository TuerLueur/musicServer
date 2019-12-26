package com.music.server.service;

import com.music.server.entity.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> searchArtistByName(String name);
}
