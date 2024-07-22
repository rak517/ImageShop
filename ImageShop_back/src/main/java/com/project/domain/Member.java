package com.project.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Member {
    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String job;
    private int coin;
    private boolean enabled;
    private Date regDate;
    private Date updDate;
    private List<MemberAuth> authList;
}
