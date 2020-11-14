package xkw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xkw.entity.User;
import xkw.service.UserService;

/**
 * @author: xingjiacheng
 * @create: 2020-11-14 11:57
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public User getUserInfo() {
        return userService.getUserInfo();
    }
}
