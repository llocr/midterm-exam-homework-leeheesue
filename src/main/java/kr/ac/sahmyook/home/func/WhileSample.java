package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {

    public void printUniCode(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자 하나를 입력해 주세요 : ");
            String c = sc.nextLine();

            if(c.length() > 1) {
                System.out.println("한 개의 문자만 입력해주세요");
                printUniCode();
            }

            if(c.equals(0)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(c + "의 uni 코드는 '" + (int)c.charAt(0) + "' 입니다.");
        }
    }

    public void sum1To100(){
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1부터 100까지의 합은" + sum + "입니다.");
    }

    public void numberGame(){
        int ranNum = (int)(Math.random()*100 + 1);
        Scanner sc = new Scanner(System.in);
        int inputNum;
        int chance = 1;
        boolean flag = false;

        while(!flag) {
            System.out.print("정수를 입력하세요 : ");
            inputNum = sc.nextInt();

            if(inputNum == ranNum) {
                System.out.println("정답입니다. " + chance + "회만에 정답을 맞추셨습니다.");
                flag = true;
            } else if (inputNum > ranNum) {
                System.out.println("입력하신 정수보다 작습니다.");
                chance ++;
            } else if (inputNum < ranNum) {
                System.out.println("입력하신 정수보다 큽니다.");
                chance ++;
            }
        }
    }

    public void countCharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        int i = 0;
        int count = 0;

        while(i < str.length()) {
            if(str.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
        System.out.println(str + "의 문자의 수는 " + count + "개 입니다.");
    }

    public void countInChar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = "";
        str = sc.nextLine();
        System.out.print("문자를 입력하세요 : ");
        String c = sc.nextLine();
        int count = 0;

        int i = 0;

        while( i < str.length()) {

            if(str.charAt(i) == c.charAt(0)) {
                count++;
            }
            i++;
        }
        System.out.println(str + "내에 " + c + "의 갯수는 " + count + "개 입니다.");
    }

}
