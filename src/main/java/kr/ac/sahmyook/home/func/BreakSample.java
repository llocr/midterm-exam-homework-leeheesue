package kr.ac.sahmyook.home.func;

public class BreakSample {

    public void sumBreak(){

        int i = 1;
        int sum = 0;

        while(true) {
            sum += i;
            if (i == 100) {
                break;
            }
            i++;
        }
        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }

    public void guguDanBreak(){

        for(int i = 0; i < 10; i++) {
            System.out.println(i+"단");
            for(int j = 0; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j );

                if(j == 5) break;
            }
        }
    }
}
