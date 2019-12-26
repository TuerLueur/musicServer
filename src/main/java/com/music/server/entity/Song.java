package com.music.server.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;

@Data
@Accessors(chain = true)
public class Song {
    BigInteger song_id;
    String song_name;
    BigInteger artist_id;
    String lyric;
    String link;
    String comments;
}
