package com.music.server.controller;


import com.music.server.entity.Playlist;
import com.music.server.service.PlaylistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@Slf4j
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    private static Logger logger = Logger.getLogger("playlistService");

    @GetMapping(value = "/getPlaylistById")
    public List<Playlist> getPlaylistById(BigInteger pid) {

        return playlistService.getPlaylistById(pid);
    }

    @PostMapping(value = "/multiFilterPlaylist")
    public List<Playlist> multiFilterPlaylist(@RequestBody List<String> tags) {
        logger.info("multiFilter");
        if (tags == null) {
            return new ArrayList<>();
        }
        logger.info(tags.toString());
        System.out.println(playlistService.multiFilterPlaylist(tags).toString());
        return playlistService.multiFilterPlaylist(tags);
    }

    @GetMapping(value = "/getRandomPlaylists")
    public List<Playlist> getRandomPlaylists(){
        return playlistService.getRandomPlaylists();
    }
}
