package kr.hs.study.loginExam.Controller;

import kr.hs.study.loginExam.DTO.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/result")
    public String loginResult(@ModelAttribute LoginDTO dto, Model model){
        model.addAttribute("re", dto);
        return "result";
    }

}
