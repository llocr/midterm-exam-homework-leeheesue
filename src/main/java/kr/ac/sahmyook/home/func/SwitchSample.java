package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해 주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해 주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("연산자를 입력해주세요 : ");
        String op = sc.nextLine();

        switch (op.charAt(0)) {
            case '+' :
                System.out.println(num1 + op.charAt(0) + num2 + "=" + (num1+num2));
            case '-' :
                System.out.println(num1 + op.charAt(0) + num2 + "=" + (num1-num2));
            case '*' :
                System.out.println(num1 + op.charAt(0) + num2 + "=" + (num1*num2));
            case '/' :
                System.out.println(num1 + op.charAt(0) + num2 + "=" + (num1/num2));
            case '%' :
                System.out.println(num1 + op.charAt(0) + num2 + "=" + (num1%num2));;
        }
    }

    public void fruitPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 있는 과일 : 사과, 복숭아, 딸기, 배, 파파야, 수박");
        System.out.print("알고 싶은 과일 이름을 작성해주세요 : ");
        String fruit = sc.nextLine();
        int price = 0;

        switch (fruit) {
            case "사과" :
                price = 3000;
                break;
            case "복숭아" :
                price = 5000;
                break;
            case "딸기" :
                price = 15000;
                break;
            case "배" :
                price = 2000;
                break;
            case "파파야" :
                price = 9000;
                break;
            case "수박" :
                price = 25000;
                break;
            default:
                System.out.print("해당하는 과일이 없습니다. 다시 선택해주세요 : ");
                fruit = sc.nextLine();
        }

        System.out.println(fruit + "의 가격은" + price + "원 입니다.");

    }
}
