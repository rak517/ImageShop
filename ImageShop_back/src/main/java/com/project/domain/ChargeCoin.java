package com.project.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ChargeCoin {

    private int historyNo;
    private int userNo;
    private int amount;
    private Date regDate;
}
