package service;


import model.UserVO;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @RequiresRoles("admin")
    public List<UserVO> findAllUsers(){

        return Collections.emptyList();
    }
}
