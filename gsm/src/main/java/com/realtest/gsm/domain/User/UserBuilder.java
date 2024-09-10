package com.realtest.gsm.domain.User;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserBuilder {
    private Long id;
    private String name;
    private String email;
    private String password;
}
