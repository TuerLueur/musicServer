package com.music.server.mapper;


import com.music.server.model.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface SongMapper {

    List<Song> searchSongByName(String name);
    String getCommentsById(BigInteger sid);
}
