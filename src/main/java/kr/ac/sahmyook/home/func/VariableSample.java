package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {

    public void myProfile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("생년월일을 입력하세요 (예 : 1월 14일) : ");
        String birth = sc.nextLine();
        System.out.print("전화번호를 입력하세요 (예 : 010-5284-6797) : ");
        String phone = sc.nextLine();

        System.out.println("*** 나의 신상정보를 출력합니다 ***");
        System.out.println("나의 이름 : " + name);
        System.out.println("나의 나이 : " + age);
        System.out.println("나의 생년월일 : " + birth);
        System.out.println("나의 전화번호 : " + phone);
    }

    public void empInformation(){
        Scanner sc = new Scanner(System.in);

        System.out.print("사원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("사원 번호를 입력하세요 : ");
        String number = sc.nextLine();
        System.out.print("해당 부서를 입력하세요 : ");
        String department = sc.nextLine();
        System.out.print("해당 직무를 입력하세요 : ");
        String job = sc.nextLine();

        System.out.println("*** 사원 정보를 출력합니다 ***");
        System.out.println("사원 이름 : " + name);
        System.out.println("사원 번호 : " + number);
        System.out.println("해당 부서 : " + department);
        System.out.println("직무 : " + job);
    }
}
