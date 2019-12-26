package com.music.server.service;

import com.music.server.entity.SongInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongInfoVOService {
    List<SongInfoVO> getSongByName(@Param("name") String name);
}
