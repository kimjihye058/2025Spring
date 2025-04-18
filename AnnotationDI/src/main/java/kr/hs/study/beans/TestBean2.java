package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t2")
public class TestBean2 {
    @Autowired      // 타입으로만 찾음(주입)
    @Qualifier("dataBean2")        // 동일한 객체이름을 지정할 때(주입)
    private DataBean2 data1;

    public DataBean2 getData1() {
        return data1;
    }
}
