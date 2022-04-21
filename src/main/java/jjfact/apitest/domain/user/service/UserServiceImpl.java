package jjfact.apitest.domain.user.service;

import jjfact.apitest.domain.user.User;
import jjfact.apitest.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional
    @Override
    public User insertUser(User user) {
        User save = userRepository.save(user);
        log.info("UserService - insertUser : {} save ",save.getId());
        return save;
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void updateUser(Long id) {

    }

    @Override
    public boolean checkEmail(String query) {
        return false;
    }

    @Override
    public boolean checkNickName(String query) {
        return false;
    }
}
