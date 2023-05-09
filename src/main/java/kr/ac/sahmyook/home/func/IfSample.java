package kr.ac.sahmyook.home.func;

import java.awt.*;
import java.util.Scanner;

public class IfSample {
    public void maxNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();

        System.out.println("두 수 중에 더 큰 수는 " + Math.max(num1, num2) + "입니다.");
    }
    public void minNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();

        System.out.println("두 수 중에 더 작은 수는 " + Math.min(num1, num2) + "입니다.");

    }
    public void threeMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("세번째 숫자를 입력해주세요 : ");
        int num3 = sc.nextInt();

        int tmp1 = Math.max(num1, num2);
        int maxNum = Math.max(tmp1, num3);

        int tmp2 = Math.min(num1, num2);
        int minNum = Math.min(tmp2, num3);

        System.out.println("세 수 중 가장 큰 수는 " + maxNum + "입니다.");
        System.out.println("세 수 중 가장 작은 수는 " + minNum + "입니다.");
    }
    public void checkEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + "은 짝수입니다.");
        } else {
            System.out.println(num + "은 홀수입니다.");
        }
    }
    public void isPassFail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력해 주세요 : ");
        int korea = sc.nextInt();
        System.out.print("영어 점수를 입력해 주세요 : ");
        int english = sc.nextInt();
        System.out.print("수학 점수를 입력해 주세요 : ");
        int math = sc.nextInt();

        int avg = (korea + english + math) / 3;

        if(avg >= 60 && korea >= 40 && english >= 40 && math >=40) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }
    public void scoreGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");
        int score = sc.nextInt();

        if(score >= 95) {
            System.out.println("당신의 학점은 A+ 입니다.");
        } else if(score >= 90) {
            System.out.println("당신의 학점은 A 입니다.");
        } else if(score >= 85) {
            System.out.println("당신의 학점은 B+ 입니다.");
        } else if(score >= 80) {
            System.out.println("당신의 학점은 B 입니다.");
        } else if(score >= 75) {
            System.out.println("당신의 학점은 C+ 입니다.");
        } else if(score >= 70) {
            System.out.println("당신의 학점은 C 입니다.");
        } else if(score >= 65) {
            System.out.println("당신의 학점은 D+ 입니다.");
        } else if(score >= 60) {
            System.out.println("당신의 학점은 D 입니다.");
        } else {
            System.out.println("당신의 학점은 F 입니다.");
        }
    }
    public void checkPlusMinusZero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("한 개의 정수를 입력해 주세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + "은 양수입니다.");
        } else if (num < 0) {
            System.out.println(num + "은 음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
    public void whatCaracter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("한 개의 문자를 입력해 주세요 : ");
        String str = sc.nextLine();

        if(str.length() > 1) {
            System.out.println("문자의 길이가 깁니다.");
            whatCaracter();
        }

        if((int)str.charAt(0) >= 65 && (int)str.charAt(0) <= 90 ) {
            System.out.println(str + "은 영어 대문자입니다.");
        } else if((int)str.charAt(0) >= 97 && (int)str.charAt(0) <= 122) {
            System.out.println(str + "은 영어 소문자입니다.");
        } else if((int)str.charAt(0) >= 48 && (int)str.charAt(0) <= 57) {
            System.out.println(str + "은 숫자입니다.");
        } else {
            System.out.println(str + "은 특수문자입니다.");
        }
    }
}
