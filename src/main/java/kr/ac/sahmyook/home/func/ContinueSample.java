package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree(){
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                continue;
            } else {
                sum += i;
            }
        }

        System.out.println("1부터 100까지 3의 배수를 뺀 정수들의 합 : " + sum);
    }

    public void rowColJump(){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == 0 && j > 2) {
                    continue;
                }
                System.out.print((i+1) + "행" + (j+1) + "열 |");
            }
            System.out.println();
        }
    }
}
