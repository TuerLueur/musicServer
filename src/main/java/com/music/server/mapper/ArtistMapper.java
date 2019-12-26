package com.music.server.mapper;


import com.music.server.model.Artist;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArtistMapper {

    List<Artist> searchArtistByName(String name);
}
