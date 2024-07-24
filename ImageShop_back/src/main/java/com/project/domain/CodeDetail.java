package com.project.domain;

import lombok.Data;

import java.util.Date;

@Data
public class CodeDetail {

    private String groupCode;   // 그룹코드
    private String codeValue;   // 코드값
    private String codeName;    // 코드이름
    private int sortSeq;        // 정렬순서
    private String useYn;       // 사용유무
    private Date regDate;       // 등록일
    private Date updDate;       // 수정일
}
