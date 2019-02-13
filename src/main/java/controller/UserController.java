package controller;


import model.UserVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(
        final UserService userService
    ){
        this.userService = userService;
    }

    @PostMapping("/user/login")
    public ResponseEntity<String> login(
        @RequestParam("name") final String name,
        @RequestParam("pwd") final String password
    ) {

        final Subject currentUser = SecurityUtils.getSubject();
        if( !currentUser.isAuthenticated()){

            final UsernamePasswordToken token = new UsernamePasswordToken(name, password);
            currentUser.login(token);
        }

        return ResponseEntity.ok("login ok");
    }

}
