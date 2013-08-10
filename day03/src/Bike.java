/**
 * Created by Administrator on 13-8-10.
 */
public class Bike extends Vehicle{
    int wheels;//轮子数


    Bike(String name, double speed, int peoples,int wheels) {
        super(name, speed, peoples);
        this.wheels = wheels;
    }


}
