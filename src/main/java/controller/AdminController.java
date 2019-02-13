package controller;

import model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import java.util.List;

@RestController
public class AdminController {

    private final UserService userService;

    @Autowired
    public AdminController(
        final UserService userService
    ){
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserVO>> searchAll() {

        return ResponseEntity.ok(userService.findAllUsers());
    }

}
