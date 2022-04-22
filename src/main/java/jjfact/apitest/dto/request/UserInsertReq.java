package jjfact.apitest.dto.request;

import jjfact.apitest.domain.user.User;

public class UserInsertReq {
    private String nickName;
    private String email;
    private String password;
    private String profileImage;

    private double height;
    private double weight;

    private String gender;
    private String intro;
    private String fcmToken;

//    public User toEntity(){
//        return new User.UserBuilder()
//                .nickName(nickName)
//                .email(email)
//                .password(password)
//                .profileImage(profileImage)
//                .height(height)
//                .weight(weight)
//                .gender(gender)
//                .intro(intro)
//                .build();
//    }
}
