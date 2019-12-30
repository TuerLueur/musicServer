package com.music.server.entity;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SongComment {
    private String comment;
    private int value;
}
