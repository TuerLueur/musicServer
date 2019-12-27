package com.music.server.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;

@Data
@Accessors(chain = true)
public class SongInfoVO {
    BigInteger id;
    String song_name;
    String artist_name;
    String album_name;
}
