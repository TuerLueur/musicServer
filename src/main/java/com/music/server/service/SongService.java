package com.music.server.service;

import com.music.server.model.Song;
import com.music.server.model.SongComment;

import java.math.BigInteger;
import java.util.List;

public interface SongService {
    List<Song> searchSongByName(String name);

    List<SongComment> getCommentMapById(BigInteger sid);
}
