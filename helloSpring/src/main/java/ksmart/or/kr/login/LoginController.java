package ksmart.or.kr.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("login/login")
    public String movePageMain() {
        System.out.println("movePageLogin()");
        return "login/login";
    }
}
