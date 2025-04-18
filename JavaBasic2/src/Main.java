//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HelloWorld h1 = new HelloWorldEn();
        callMethod(h1);
    }
    public static void callMethod(HelloWorld h) {
        h.sayHello();
    }
}