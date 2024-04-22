package ksmart.or.kr.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("main")
    public String movePageMain() {
        System.out.println("movePageMain()");
        return "main";
    }
}
