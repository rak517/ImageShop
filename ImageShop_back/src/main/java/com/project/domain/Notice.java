package com.project.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Notice {

    private int noticeNo;
    private String title;
    private String content;
    private Date regDate;
}
