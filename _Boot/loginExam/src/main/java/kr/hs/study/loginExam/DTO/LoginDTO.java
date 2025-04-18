package kr.hs.study.loginExam.DTO;

import lombok.Data;
@Data // setter와 getter가 들어가있음, lombok최고
public class LoginDTO {
    private String userId;
    private int userPs;
}
