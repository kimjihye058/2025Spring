package kr.hs.study.beans;

public class Owner {

    private String name;
    private String addr;

    public Owner(String name, String addr){
        this.name = name;
        this.addr = addr;
    }

    public void prDate(){
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
    }

}
