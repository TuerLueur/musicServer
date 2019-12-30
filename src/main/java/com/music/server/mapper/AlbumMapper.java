package com.music.server.mapper;


import com.music.server.entity.Album;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface AlbumMapper {

    List<Album> searchAlbumByName(String name);
    List<Album> getAlbumByArtistId(BigInteger aid);
}
