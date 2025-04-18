package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. config.xml파일을 로딩해서 객체를 생성, 보관
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");  // Spring Context 라이브러리 다운로드 필요

//        // 2. 객체를 가지고 와서 주소값 출력
//        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1:" + obj1);
//        // obj2에 넣고 주솟값 출력 -> obj1 과 객체 주소가 같음 = 같은 객체 주솟값을 불러옴(singleton)
//        TestBean obj2 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj2:" + obj2);
//        System.out.println("-------------------------------------------------------");
//        // t2객체 가져와서 obj3에 넣고 주솟값 출력
//        TestBean obj3 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj3:" + obj3);
//        // t2객체 가져와서 obj4에 넣고 주솟값 출력
//        TestBean obj4 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj4:" + obj4);
//        System.out.println("-------------------------------------------------------");


        ctx.close();
    }
}