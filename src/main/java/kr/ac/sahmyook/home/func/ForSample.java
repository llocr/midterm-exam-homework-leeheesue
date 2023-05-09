package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    public void sum1to10(){
        int sum = 0;
        for(int i = 1; i < 11; i++) {
           sum += i;
        }
        System.out.println("1부터 10까지의 합은" + sum + "입니다.");
    }

    public void sumEven1To100(){
        int sum = 0;
        for(int i = 100; i > 0; i = i - 2) {
            sum += i;
        }
        System.out.println("1부터 100 사이의 짝수들의 합은 " + sum + "입니다.");
    }

    public void oneGugudan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요? 숫자만 입력해주세요 : ");
        int dan = sc.nextInt();

        System.out.println(dan + "단을 출력합니다.");
        for(int i = 1; i < 10; i++) {
            System.out.println( dan + "*" + i + "=" + dan*i);
        }
    }

    public void sumMinToMax(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해 주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해 주세요 : ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int sum = 0;

        for(int i = min; i < max + 1; i++) {
            sum += i;
        }

        System.out.println(min + "부터" + max + "까지, 숫자의 합은 " + sum + "입니다.");
    }

    public void printStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수를 입력해 주세요 : ");
        int row = sc.nextInt();
        System.out.print("칸 수를 입력해 주세요 : ");
        int col = sc.nextInt();

        System.out.println("별 찍기를 시작합니다.");
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printNumberStar(){
        System.out.println("7줄 별 찍기를 시작합니다");

        for(int i  = 1; i < 8; i++) {
            for(int j = 1; j < 8; j++) {
                if(j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printTriangleStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 삼각형의 줄 수를 입력해 주세요 : ");
        int num = sc.nextInt();

        if(num > 0) {
            for(int i = 1; i < num+1; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (num < 0) {
            for(int i = Math.abs(num); i > 0; i--) {
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("0개의 줄은 출력할 수 없습니다.");
            printTriangleStar();
        }
    }

    public void guguDan(){
        System.out.println("***구구단 출력을 시작합니다 ***");

        for(int i = 2; i < 10; i++) {
            System.out.println(i+"단");
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
