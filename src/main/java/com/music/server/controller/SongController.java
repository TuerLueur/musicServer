package com.music.server.controller;

import com.music.server.entity.Song;
import com.music.server.entity.SongComment;
import com.music.server.entity.SongInfoVO;
import com.music.server.service.SongInfoVOService;
import com.music.server.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping(value = "/getCommentMapById")
    public List<SongComment> getCommentMapById(BigInteger sid){
        System.out.println("------------------------------------");
        System.out.println(songService.getCommentMapById(sid));
        return songService.getCommentMapById(sid);
    }
}
