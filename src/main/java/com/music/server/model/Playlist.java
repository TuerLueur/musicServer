package com.music.server.model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Playlist {
    BigInteger pid;
    String name;
    String tag;
    String cover;
}
