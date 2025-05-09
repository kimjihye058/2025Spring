package kr.hs.study.Redirect_Forward.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/forward")
    public String forward(){
        return "forward:/sub1";     // sub1의 주소로 이동하라
    }
    
    @GetMapping("/sub1")
    public String sub1(){
        return "sub1";      // sub1 html 파일
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/sub1";
    }
}
