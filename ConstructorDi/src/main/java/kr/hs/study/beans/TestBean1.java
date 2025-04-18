package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1() {
        System.out.println("TestBean1의 기본생성자");
        this.data1 = 1;
        this.data2 = 1.1;
        this.data3 = "kim";
    }

    public TestBean1(int data1) {
        System.out.println("TestBean1의 int형 생성자");
        this.data1 = data1;
        this.data2 = 2.2;
        this.data3 = "lee";
    }

    public TestBean1(double data2) {
        System.out.println("TestBean1의 double형 생성자");
        this.data1 = 3;
        this.data2 = data2;
        this.data3 = "lay";
    }

    public TestBean1(String data3) {
        System.out.println("TestBean1의 String형 생성자");
        this.data1 = 5;
        this.data2 = 5.5;
        this.data3 = data3;
    }

    public void prData(){
        System.out.println("data1: " + data1);
        System.out.println("data2: " + data2);
        System.out.println("data3: " + data3);

    }
}
