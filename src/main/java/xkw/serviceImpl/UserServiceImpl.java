package xkw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xkw.entity.User;
import xkw.repository.UserRepository;
import xkw.service.UserService;

/**
 * @author: xingjiacheng
 * @create: 2020-11-14 12:02
 **/

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserRepository userRepository;

    @Override
    public User getUserInfo() {

//        return userRepository.selectUser();
        return new User(1, "张三", "男", 173.5f, 120.5f);
    }
}
