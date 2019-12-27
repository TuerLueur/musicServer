package com.music.server.service;

import com.music.server.entity.Song;
import com.music.server.entity.SongComment;

import java.math.BigInteger;
import java.util.List;

public interface SongService {

    List<SongComment> getCommentMapById(BigInteger sid);
}
