package jjfact.apitest.dto.user;

import jjfact.apitest.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class UserInsertReq {
    private String username;
    private String email;
    private String password;

    public User toEntity(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
    }

}
