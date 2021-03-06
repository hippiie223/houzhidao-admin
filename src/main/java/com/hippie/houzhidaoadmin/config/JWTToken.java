package com.hippie.houzhidaoadmin.config;

import org.apache.shiro.authc.HostAuthenticationToken;

/**
 * @author 39239
 * @Date 2019/5/6 22:45
 * @Package com.hippie.houzhidaoadmin.config
 * @Description:
 */

public class JWTToken implements HostAuthenticationToken {
    private static final long serialVersionUID = 9217639903967592166L;

    private String token;
    private String host;

    public JWTToken(String token) {
        this(token, null);
    }

    public JWTToken(String token, String host) {
        this.token = token;
        this.host = host;
    }

    public String getToken(){
        return this.token;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public String toString(){
        return token + ':' + host;
    }
}
