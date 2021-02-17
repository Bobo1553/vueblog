package com.ethanyjxiao.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author Xiao Yijia
 * @create 2021/2/18 0:32
 */

public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
