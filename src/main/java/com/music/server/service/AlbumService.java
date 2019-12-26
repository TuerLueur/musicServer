package com.music.server.service;

import com.music.server.entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> searchAlbumByName(String name);
}
