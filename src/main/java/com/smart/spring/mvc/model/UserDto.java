package com.smart.spring.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 当前登录用户信息
 */
@Data
@AllArgsConstructor
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}