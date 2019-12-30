package com.music.server.mapper;

import com.music.server.entity.SongInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface SongInfoVOMapper {
    List<SongInfoVO> getSongByName(@Param("name") String name);
    List<SongInfoVO> getListSongs(@Param("pid") BigInteger pid);
}
