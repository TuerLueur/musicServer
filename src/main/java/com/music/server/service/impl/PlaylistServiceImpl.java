package com.music.server.service.impl;

import com.music.server.mapper.PlaylistMapper;
import com.music.server.entity.Playlist;
import com.music.server.service.PlaylistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

@Slf4j
@Service("PlaylistService")
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
    private PlaylistMapper playlistMapper;

    private static Logger logger = Logger.getLogger("PlaylistServiceImpl");

    @Override
    public List<Playlist> getPlaylistById(BigInteger pid) {

        return playlistMapper.getPlaylistById(pid);
    }

    @Override
    public List<Playlist> multiFilterPlaylist(List<String> tags) {
        Set<Playlist> playSet = new HashSet<>();
        tags.forEach(tag->{
            String appendSymbel = (new StringBuffer().append('%').append(tag).append('%')).toString();
            logger.info("appendSymbel:"+appendSymbel);
            List<Playlist> playlists = playlistMapper.multiFilterPlaylist(appendSymbel);
            playSet.addAll(playlists);
        });
        return new ArrayList<>(playSet);
    }
}
