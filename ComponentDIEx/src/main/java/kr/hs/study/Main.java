package kr.hs.study;

import kr.hs.study.beans.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");
        Member kim = ctx.getBean("m1", Member.class);
        System.out.println("name : " + kim.getName());
        System.out.println("nickName : " + kim.getNickName());
        System.out.println("addr : " + kim.getAddr());
        System.out.println("hobby : " + kim.getHobby().getHobby_name());

        ctx.close();

    }
}