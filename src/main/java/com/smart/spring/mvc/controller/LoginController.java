package com.smart.spring.mvc.controller;


import com.smart.spring.mvc.model.AuthenticationRequest;
import com.smart.spring.mvc.model.UserDto;
import com.smart.spring.mvc.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;
    /**
     * 用户登录
     *
     * @param authenticationRequest 登录请求
     * @return
     */
    @RequestMapping(value = "/login", produces = {"text/plain;charset=utf-8"})
    public String login(AuthenticationRequest authenticationRequest) {
        UserDto userDto = authenticationService.authentication(authenticationRequest);
        return userDto.getFullname() + " 登录成功";
    }

}
