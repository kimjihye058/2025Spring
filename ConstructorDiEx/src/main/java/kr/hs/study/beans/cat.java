package kr.hs.study.beans;

public class cat implements Animal {
    String color;
    int leg;
    Owner o1;   // 참조형 타입

    @Override
    public void eat() {
        System.out.println("고양이가 밥먹는다.");
    }

    @Override
    public void go() {
        System.out.println("고양이가 밥먹는다.");
    }

    public cat(String color, int leg, Owner o1) {
        this.color = color;
        this.leg = leg;
        this.o1 = o1;
    }

    public void prAnimal(){
        System.out.println("고양이의 색깔은 " + color);
        System.out.println("고양이 다리의 갯수는 " + leg + "개");
        System.out.println("고양이의 주인은 " + o1);

    }
}
