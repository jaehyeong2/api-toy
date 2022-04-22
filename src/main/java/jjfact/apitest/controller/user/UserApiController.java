package jjfact.apitest.controller.user;

import jjfact.apitest.domain.user.User;
import jjfact.apitest.dto.user.UserInsertReq;
import jjfact.apitest.service.user.UserServiceImpl;
import jjfact.apitest.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserApiController {
    private final UserServiceImpl userService;

    @GetMapping("/{id}")
    public ApiResponse<?> getUser(@PathVariable Long id){
        User user = userService.getUser(id);
        return new ApiResponse<>(user, HttpStatus.OK);
    }

    @GetMapping("")
    public ApiResponse<?> getUserList(){
        List<User> userList = userService.getUserList();
        return new ApiResponse<>(userList, HttpStatus.OK);
    }


    @GetMapping("/duplicate/username")
    public ApiResponse<?> usernameCheck(@RequestParam String username){
        boolean result = userService.checkUsername(username);
        return new ApiResponse<>(result, HttpStatus.OK);
    }
    @GetMapping("/duplicate/email")
    public ApiResponse<?> emailCheck(@RequestParam String email){
        boolean result = userService.checkEmail(email);
        return new ApiResponse<>(result, HttpStatus.OK);
    }

    @PostMapping("")
    public ApiResponse<?> insert(@RequestBody UserInsertReq req){
        User user = req.toEntity();
        userService.insertUser(user);
        return new ApiResponse<>("ok", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<?> delete(@PathVariable Long id){
        userService.deleteUser(id);
        return new ApiResponse<>("ok", HttpStatus.OK);
    }
}
