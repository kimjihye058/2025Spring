package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // config.xml 파일을 로딩해서 객체를 생성하고 보관한다.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//        TestBean obj1 =  ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1:" + obj1);

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        System.out.println("obj2:" + obj2);

        TestBean obj4 = ctx.getBean("t2", TestBean.class);
        System.out.println("obj4:" + obj4);

//        TestBean obj3 = ctx.getBean("t3", TestBean.class);
//        System.out.println("obj3:" + obj3);

        ctx.close();
    }
}