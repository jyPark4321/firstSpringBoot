package ksmart.or.kr.login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
@Controller
public class LoginController {

    @RequestMapping("login/login")
    public String moveLoginPage() {
        System.out.println("moveLoginPage()");
        return "login/loginForm";
    }
    @RequestMapping("/login/loginAction")
    public String loginAction(HttpServletRequest request, Model model) {
        System.out.println("loginAction()");
        String uname = request.getParameter("uname");
        String psw = request.getParameter("psw");
        System.out.println(uname);
        System.out.println(psw);
        if(uname.equals("test") && psw.equals("test")) {
            System.out.println("id, pw 일치 메인 페이지로 이동합니다.");
            model.addAttribute("uname", uname);
            model.addAttribute("psw", psw);
            request.setAttribute("uname2", uname);
            request.setAttribute("psw2", psw);
            return "main";
        } else {
            System.out.println("id, pw 불일치 회원가입 페이지로 이동합니다.");
            return "login/registerForm";
        }
    }
}