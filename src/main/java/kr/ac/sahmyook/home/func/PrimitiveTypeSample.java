package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class PrimitiveTypeSample {
    public void typeSize() {
        Scanner sc = new Scanner(System.in);
        int menuNum;

        System.out.println("*** 기본 자료형 데이터 타입 ***");
        System.out.println("1. 논리형 데이터 타입");
        System.out.println("2. 문자형 데이터 타입");
        System.out.println("3. 정수형 데이터 타입");
        System.out.println("4. 실수형 데이터 타입");
        System.out.print("알고 싶은 데이터 타입을 입력해 주세요 : ");
        menuNum = sc.nextInt();

        switch (menuNum) {
            case 1 :
                System.out.println("*** 논리형 데이터 타입 ***");
                System.out.println("명칭 : boolean | 데이터 크기 : 1byte");
                break;
            case 2 :
                System.out.println("*** 문자형 데이터 타입 ***");
                System.out.println("명칭 : char | 데이터 크기 : 2byte");
                break;
            case 3 :
                System.out.println("*** 정수형 데이터 타입 ***");
                System.out.println("명칭 : byte | 데이터 크기 : 1byte");
                System.out.println("명칭 : short | 데이터 크기 : 2byte");
                System.out.println("명칭 : int | 데이터 크기 : 4byte");
                System.out.println("명칭 : long | 데이터 크기 : 8byte");
                break;
            case 4 :
                System.out.println("*** 실수형 데이터 타입 ***");
                System.out.println("명칭 : float | 데이터 크기 : 4byte");
                System.out.println("명칭 : double | 데이터 크기 : 8byte");
                break;
            default:
                System.out.print("알고 싶은 데이터 타입을 입력해 주세요 : ");
                menuNum = sc.nextInt();
        }
    }
}
