package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx1.getBean("t1", TestBean1.class);
        obj1.prData();
        System.out.println("=======================================");
        TestBean1 obj2 = ctx1.getBean("t2", TestBean1.class);
        obj2.prData();
        System.out.println("=======================================");
        TestBean2 obj3 = ctx1.getBean("t3", TestBean2.class);
        obj3.prData();

        ctx1.close();
    }
}