package com.music.server.mapper;


import com.music.server.entity.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface SongMapper {

    String getCommentsById(BigInteger sid);
}
