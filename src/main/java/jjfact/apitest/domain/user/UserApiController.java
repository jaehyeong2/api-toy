package jjfact.apitest.domain.user;

import jjfact.apitest.domain.user.dto.UserInsertReq;
import jjfact.apitest.domain.user.service.UserServiceImpl;
import jjfact.apitest.global.dto.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserApiController {

    private final UserServiceImpl userService;

    @PostMapping("")
    public ApiResponse<?> insert(@RequestBody User user){
        userService.insertUser(user);
        return new ApiResponse<>("ok");
    }

    @DeleteMapping("/{id}")
    public ApiResponse<?> delete(@PathVariable Long id){
        userService.deleteUser(id);
        return new ApiResponse<>("ok");
    }
}
