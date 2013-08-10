package training.exercise;

import java.util.Random;

/**
 * Created by Administrator on 13-8-10.
 */
public class Exercise {

    /**
     * random [0,20] 10000次
     * 并判断效率和分布
     */
    void random1(){
        Random random = new Random();
        for(int i=0; i<10000; i++){
            int randomValue = random.nextInt(20) + 1;
            System.out.println("randomValue: " + randomValue);
        }
    }

    void random2(){
        for (int i = 0; i < 10000; i++) {
            double d = Math.random();
            int randomValue = (int)(d*20)+1;
            System.out.println("randomValue22: " + randomValue);
        }
    }

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.random1();
        System.out.println("***********************");
        exercise.random2();
    }
}
