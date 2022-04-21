package jjfact.apitest.domain.user.service;

import jjfact.apitest.domain.user.User;

public interface UserService {
    User insertUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id);
    boolean checkEmail(String query);
    boolean checkNickName(String query);
}
