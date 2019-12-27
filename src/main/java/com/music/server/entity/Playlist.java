package com.music.server.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Playlist {
    BigInteger id;
    String name;
    String tag;
    String img_src;
}
