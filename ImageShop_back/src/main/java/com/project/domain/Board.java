package com.project.domain;


import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
