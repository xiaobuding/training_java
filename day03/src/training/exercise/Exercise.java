package training.exercise;

import java.util.Date;
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
        Date date1 = new Date();
        exercise.random1();
        Date date2 = new Date();
        long aa = date2.getTime()-date1.getTime();

        System.out.println("***********************");
        Date date11 = new Date();
        exercise.random2();
        Date date22 = new Date();
        long bb = date22.getTime()-date11.getTime();

        System.out.println("Random所用时间为：" + aa +"ms");
        System.out.println("Math.random()所用时间为：" + bb + "ms");
    }
}
