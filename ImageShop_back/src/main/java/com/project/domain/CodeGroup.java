package com.project.domain;

import lombok.Data;

import java.util.Date;

@Data
public class CodeGroup {

    private String groupCode;
    private String groupName;
    private String useYn;
    private Date regDate;
    private Date updDate;
}
