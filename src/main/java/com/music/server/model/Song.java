package com.music.server.model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;

@Data
@Accessors(chain = true)
public class Song {
    BigInteger sid;
    String name;
    BigInteger aid;
    String lyric;
    String link;
    String comments;
    String album;
}
