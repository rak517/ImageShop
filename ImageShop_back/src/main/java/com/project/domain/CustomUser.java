package com.project.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.stream.Collectors;

public class CustomUser extends User {

    private static final long serialVersionUID = 1L;
    private Member member;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public CustomUser(Member member) {
        super(member.getUserId(), member.getUserPw(),
                member.getAuthList().stream().map(auth -> new SimpleGrantedAuthority(auth.getAuth())) // 내가 점검해서 권한 주고 security에 전달할거임.
                        .collect(Collectors.toList()));
        this.member = member;
    }

    public Member getMember() {
        return member;
    }
}
