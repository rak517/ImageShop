package com.project.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserItem {

    private int userItemNo;
    private int userNo;
    private int itemId;
    private String itemName;
    private Integer price;
    private String description;
    private String pictureUrl;
    private Date regDate;
}
