package top.exql.security.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/info")
    public String getUserInfo(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.toString());
        return "hello";
    }
}
