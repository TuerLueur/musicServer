package com.music.server.service.impl;


import com.music.server.entity.SongInfoVO;
import com.music.server.mapper.SongInfoVOMapper;
import com.music.server.service.SongInfoVOService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongInfoVOServiceImpl implements SongInfoVOService {
    @Autowired
    private SongInfoVOMapper songInfoVOMapper;

    @Override
    public List<SongInfoVO> getSongByName(@Param("name") String name){
        System.out.println(name);
        return songInfoVOMapper.getSongByName(name);
    }
}
