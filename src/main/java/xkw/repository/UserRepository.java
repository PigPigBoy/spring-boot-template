package xkw.repository;

import org.springframework.stereotype.Repository;
import xkw.entity.User;

//@Repository
public interface UserRepository {

    User selectUser();
}
