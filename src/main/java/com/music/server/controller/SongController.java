package com.music.server.controller;

import com.music.server.entity.SongComment;
import com.music.server.service.SongService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

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
