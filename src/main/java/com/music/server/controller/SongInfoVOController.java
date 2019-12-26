package com.music.server.controller;


import com.music.server.entity.SongInfoVO;
import com.music.server.service.SongInfoVOService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SongInfoVOController {
    @Autowired
    private SongInfoVOService songInfoVOService;

    @GetMapping(value = "/getSongByName")
    public List<SongInfoVO> getSongByName(String name){
        System.out.println("getSongByName");
        return songInfoVOService.getSongByName(name);
    }
}
