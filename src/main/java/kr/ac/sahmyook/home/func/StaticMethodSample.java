package kr.ac.sahmyook.home.func;

public class StaticMethodSample {
    public void testMathRandom(){

        int num = (int)(Math.random()* 44 + 1);

        System.out.println("1~45 사이의 임의의 정수 : " + num);
    }

    public void testMathAbs(){
        System.out.println("-12.77의 절대값 : " + Math.abs(-12.77));
    }

    public void testMathMax(){
        System.out.println("120과 54 중 큰 값은? " + Math.max(120, 54) + "입니다.");
    }
}
