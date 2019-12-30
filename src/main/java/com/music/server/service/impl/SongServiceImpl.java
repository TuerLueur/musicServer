package com.music.server.service.impl;

import com.music.server.entity.SongComment;
import com.music.server.mapper.SongMapper;
import com.music.server.service.SongService;
import com.qianxinyao.analysis.jieba.keyword.Keyword;
import com.qianxinyao.analysis.jieba.keyword.TFIDFAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service("SongService")
public class SongServiceImpl implements SongService {
    @Autowired
    private SongMapper songMapper;

    @Override
    public List<SongComment> getCommentMapById(BigInteger sid) {
        String comments = (songMapper.getCommentsById(sid));
        int topN = 20;
        List<SongComment> commentList = new ArrayList<>();
        TFIDFAnalyzer tfidfAnalyzer = new TFIDFAnalyzer();
        List<Keyword> list = tfidfAnalyzer.analyze(comments, topN);
        for (Keyword word : list) {
//            System.out.print(word.getName()+":"+word.getTfidfvalue()+",");
            String name = word.getName();
            double value = word.getTfidfvalue();
            System.out.println("value" + value);
            SongComment songComment = new SongComment();
            songComment.setComment(name);
            songComment.setValue(BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(10000)).intValue());
            commentList.add(songComment);
        }
//        System.out.println(commentList.toString());
        return commentList;
    }
}
