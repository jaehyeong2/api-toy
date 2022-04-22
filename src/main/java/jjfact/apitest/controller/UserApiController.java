package jjfact.apitest.controller;

import jjfact.apitest.domain.user.User;
import jjfact.apitest.service.user.UserServiceImpl;
import jjfact.apitest.dto.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserApiController {

    private final UserServiceImpl userService;

    @GetMapping("/{id}")
    public ApiResponse<?> getUser(@PathVariable Long id){
        userService.getUser(id);
        log.info("UserApiController: getUser 호출");
        return new ApiResponse<>("ok");
    }

    @GetMapping("")
    public ApiResponse<?> getUserList(){
        userService.getUserList();
        log.info("UserApiController: getUserList 호출");
        return new ApiResponse<>("ok");
    }

    @PostMapping("")
    public ApiResponse<?> insert(@RequestBody User user){
        userService.insertUser(user);
        log.info("UserApiController: insert 호출");
        return new ApiResponse<>("ok");
    }

    @DeleteMapping("/{id}")
    public ApiResponse<?> delete(@PathVariable Long id){
        userService.deleteUser(id);
        log.info("UserApiController: delete 호출");
        return new ApiResponse<>("ok");
    }
}
