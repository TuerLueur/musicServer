package com.music.server.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigInteger;

@Data
@Accessors(chain = true)
public class Album {
    BigInteger bid;
    String name;
    String pic;
}
