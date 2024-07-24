package com.project.domain;

import lombok.Data;

import java.util.Date;

@Data
public class PayCoin {

    private int historyNo;
    private int userNo;
    private int itemId;
    private String itemName;
    private int amount;
    private Date regDate;
}
