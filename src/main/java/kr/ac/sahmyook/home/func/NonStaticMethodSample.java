package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

    public void testScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수형 자료를 입력해 주세요 : ");
        int inum = sc.nextInt();
        System.out.print("실수형 자료를 입력해 주세요 : ");
        double dnum = sc.nextDouble();
        System.out.print("문자형 자료를 입력해 주세요 : ");
        char c = sc.nextLine().charAt(0);
        System.out.print("문자열을 입력해 주세요 : ");
        String str = sc.nextLine();

        System.out.println("출력을 시작합니다.");
        System.out.println("정수형 자료 : " + inum);
        System.out.println("실수형 자료 : " + dnum);
        System.out.println("문자형 자료 : " + c);
        System.out.println("문자열 : " + str);
    }

    public void testRandom(){
        Random random = new Random();

        int ranIntNum = random.nextInt();
        double ranDoubleNum = random.nextDouble();

        System.out.println("생성된 랜덤 정수 : " + ranIntNum);
        System.out.println("생성된 랜덤 실수 : " + ranDoubleNum);
    }
}
