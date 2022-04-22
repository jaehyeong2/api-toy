package jjfact.apitest.service.user;

import jjfact.apitest.domain.user.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);
    List<User> getUserList();
    User insertUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id);
    boolean checkEmail(String query);
    boolean checkNickName(String query);
}
