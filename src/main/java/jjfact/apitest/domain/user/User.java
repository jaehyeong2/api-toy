package jjfact.apitest.domain.user;

import jjfact.apitest.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
//    private String password;
//    private String profileImage;
//
//    private double height;
//    private double weight;
//
//    private String gender;
//    private String intro;
//    private String fcmToken;

//    @Builder
//    public User(Long id, String nickName, String email, String password, String profileImage, double height, double weight, String gender, String intro, String fcmToken) {
//        this.id = id;
//        this.nickName = nickName;
//        this.email = email;
//        this.password = password;
//        this.profileImage = profileImage;
//        this.height = height;
//        this.weight = weight;
//        this.gender = gender;
//        this.intro = intro;
//        this.fcmToken = fcmToken;
//    }
}
