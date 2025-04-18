package kr.hs.study.exam1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    // 1. 정수 5개를 입력 받아서 짝수, 홀수별 합계 출력
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }
    @PostMapping("/test1")
    public String test1Result(@RequestParam("data1") int data1,
                              @RequestParam("data2") int data2,
                              @RequestParam("data3") int data3,
                              @RequestParam("data4") int data4,
                              @RequestParam("data5") int data5) {
        int[] numbers = {data1, data2, data3, data4, data5};

        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }
        System.out.println("evenSum: " + evenSum);
        System.out.println("oddSum: " + oddSum);
        return "result";
    }

    // 2. 정수 n을 입력받은 후, 1부터 100까지의 정수 중에서 n의 배수만 출력
    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }
    @PostMapping("/test2")
    public String test2Result(@RequestParam("n") int n) {

        System.out.print(n + "의 배수: ");
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {
                System.out.print(i + ", ");
            }
        }

        return "result";
    }

    // 3. 100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력
    @GetMapping("/test3")
    public String test3() {
        return "test3";
    }
    @PostMapping("/test3")
    public String test3Result(@RequestParam("data1") int data1,
                              @RequestParam("data2") int data2) {
        if(data1<data2){
            for(int i=data1; i<=data2; i++){
                System.out.print(i + ", ");
            }
        } else if (data2<data1){
            for(int i=data2; i<=data1; i++){
                System.out.print(i + ", ");
            }
        }

        return "result";
    }

    // 4. 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력
    @GetMapping("/test4")
    public String test4() {
        return "test4";
    }
    @PostMapping("/test4")
    public String test4Result(@RequestParam("n") int n) {
        
        int sum = 0;
        
        for(int i=1; i<=n; i++){
            if(i%5==0){
                sum += i;
            }
        }
        System.out.print("5의 배수의 합: " + sum);
        return "result";
    }

    // 5.  10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력
    @GetMapping("/test5")
    public String test5() {
        return "test5";
    }
    @PostMapping("/test5")
    public String test5Result(@RequestParam("data1") int data1,
                              @RequestParam("data2") int data2,
                              @RequestParam("data3") int data3,
                              @RequestParam("data4") int data4,
                              @RequestParam("data5") int data5,
                              @RequestParam("data6") int data6,
                              @RequestParam("data7") int data7,
                              @RequestParam("data8") int data8,
                              @RequestParam("data9") int data9,
                              @RequestParam("data10") int data10) {
        int[] numbers = {data1, data2, data3, data4, data5, data6, data7, data8, data9, data10};

        int evenCount = 0;
        int oddCount = 0;

        for(int num : numbers){
            if(num%2==0){
                evenCount ++;
            } else {
                oddCount ++;
            }
        }

        System.out.println("짝수의 개수: " + evenCount);
        System.out.println("홀수의 개수: " + oddCount);
        return "result";
    }

    // 6. 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력
    @GetMapping("/test6")
    public String test6() {
        return "test6";
    }
    @PostMapping("/test6")
    public String test6Result(@RequestParam("data1") int data1,
                              @RequestParam("data2") int data2) {

        int sum3or5 = 0;
        int count3or5 = 0;

        if(data1<data2){
            for(int i=data1; i<=data2; i++){
               if(i%3==0 || i%5==0) {
                   sum3or5 += i;
                   count3or5 ++;
               }
            }
        } else if (data2<data1){
            for(int i=data2; i<=data1; i++){
                if(i%3==0 || i%5==0) {
                    sum3or5 += i;
                    count3or5 ++;
                }
            }
        }

        System.out.println("3의 배수이거나 5의 배수인 수들의 합: " + sum3or5);
        System.out.println("3의 배수이거나 5의 배수인 수들의 평균: " + sum3or5/count3or5);

        return "result";
    }

    // 7.한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력
    @GetMapping("/test7")
    public String test7() {
        return "test7";
    }
    @PostMapping("/test7")
    public String test7Result(@RequestParam("n") int n){
        System.out.println(n+"의 배수 10개: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + ", ");
        }
        return "result";
    }

}
