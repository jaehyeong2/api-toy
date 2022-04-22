package jjfact.apitest.service.user;

import jjfact.apitest.domain.user.User;
import jjfact.apitest.repository.user.UserRepository;
import jjfact.apitest.repository.user.UserRepositorySupport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRepositorySupport userRepositorySupport;

    @Override
    public User getUser(Long id) {
//        User findUser = userRepository.findById(id).orElseThrow(() -> {
//            return new IllegalStateException("조회 실패");
//        });

        User findUser = userRepositorySupport.findById(id);
        return findUser;
    }

    @Override
    public List<User> getUserList() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

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

    @Override   // 중복이면 true
    public boolean checkEmail(String email) {
        long result = userRepositorySupport.duplicateCheckEmail(email);

        if(result == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkUsername(String username) {
        long result = userRepositorySupport.duplicateCheckUsername(username);

        if(result == 1){
            return true;
        }
        return false;
    }
}
