package jjfact.apitest.dto;

import lombok.Getter;

@Getter
public class TokenResponse{
    public String token;
    public String refreshToken;
    public TokenResponse(String token,String reToken){
//        super(user);
        this.token = token;
        this.refreshToken = reToken;
    }
}
