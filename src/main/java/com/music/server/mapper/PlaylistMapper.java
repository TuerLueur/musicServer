package com.music.server.mapper;


import com.music.server.entity.Playlist;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface PlaylistMapper {

    List<Playlist> getPlaylistById(BigInteger pid);

    List<Playlist> multiFilterPlaylist(String tag);
}
