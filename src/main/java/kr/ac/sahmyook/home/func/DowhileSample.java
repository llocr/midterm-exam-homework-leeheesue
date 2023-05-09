package kr.ac.sahmyook.home.func;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DowhileSample {
    public void addDashToken(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();
        int i = 0;
        String newStr = "";

        do {
            if(i < str.length() - 1) {
                newStr += str.charAt(i);
                newStr += "-";
            } else if (i == str.length() - 1) {
                newStr += str.charAt(i);
            }
            i++;
        } while(i < str.length());

        System.out.println("수정된 문자열은");
        System.out.println(newStr + "입니다.");
    }

    public void bugerKingMenu(){
        Scanner sc = new Scanner(System.in);

        String[] menu = {" ","와퍼주니어", "치즈와퍼", "기네스콰트로치즈와퍼", "통새우와퍼", "몬스터와퍼"};
        String order = "";
        int num = 0;

        do {
            System.out.println("버거킹 메뉴판");
            System.out.println("1. 와퍼주니어");
            System.out.println("2. 치즈와퍼");
            System.out.println("3. 기네스콰트로치즈와퍼");
            System.out.println("4. 통새우와퍼");
            System.out.println("5. 몬스터와퍼");
            System.out.println("6. 주문 종료하기");
            System.out.println("--------------------");
            System.out.print("메뉴 번호를 선택하세요 : ");
            num = sc.nextInt();

            if(num < 1 || num > 6) {
                System.out.println("번호를 다시 입력해주세요");
                bugerKingMenu();
            } else {
                order += menu[num];
                order += ", ";
            }
        } while(num != 6);

        System.out.println("주문 내역을 출력합니다.");
        System.out.println(order);
    }

    public void isStringAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해 주세요 : ");
        String str = sc.nextLine();
        boolean flag = false;

        do {
            if(Pattern.matches("^[a-zA-Z]*$", str) == false) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
            }  else {
                System.out.println("모두 영문자로 이루어진 문자열입니다.");
            }
            flag = true;
        } while (flag == false);
    }

}
