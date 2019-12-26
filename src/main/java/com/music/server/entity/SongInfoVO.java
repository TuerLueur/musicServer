package com.music.server.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SongInfoVO {
    String song_name;
    String artist_name;
    String album_name;
}
