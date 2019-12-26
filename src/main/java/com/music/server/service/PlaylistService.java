package com.music.server.service;

import com.music.server.model.Playlist;

import java.math.BigInteger;
import java.util.List;

public interface PlaylistService {
    List<Playlist> getPlaylistById(BigInteger pid);

    List<Playlist> multiFilterPlaylist(List<String> tags);
}
