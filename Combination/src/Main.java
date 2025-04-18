//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static void memberUse1(){
        Member user1 = new Member();    // 강한 결합으로 객체 생섣(유도리 x)
    }
    public static void memberUse2(Member m){
        Member user2 = m;   // 약한 결합으로 객체 생성(객체가 생성되었다고 믿고 결합)
    }
}

class Member{
    String name;
    String nickName;

    private Member() {   // 기본 생성자
    }
}