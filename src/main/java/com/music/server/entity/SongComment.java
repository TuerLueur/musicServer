package com.music.server.entity;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SongComment {
    private String comment;
    private Double value;
    public void setComment(String comment){
        this.comment = comment;
    }
    public void setValue(Double value){
        this.value = value;
    }

    public String getComment(){
        return this.comment;
    }
    public double getValue(){
        return this.value;
    }
}
