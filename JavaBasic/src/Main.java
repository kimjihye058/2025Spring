//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // HelloWorldEn 객체 h1 만들고
        HelloWorldEn h1 = new HelloWorldEn();
        callMethod(h1);        // hi 출력
    }

    public static void callMethod(HelloWorldEn h1) {
        h1.sayHello();
    }
}