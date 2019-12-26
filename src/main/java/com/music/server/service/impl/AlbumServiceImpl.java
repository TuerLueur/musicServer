package com.music.server.service.impl;

import com.music.server.mapper.AlbumMapper;
import com.music.server.entity.Album;
import com.music.server.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AlbumService")
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public List<Album> searchAlbumByName(String name){

        return albumMapper.searchAlbumByName(name);
    }
}
