/**
 * Created by Administrator on 13-8-10.
 */
public class Vehicle {
    private String name;
    private double speed;
    private int peoples;//承载人数

    Vehicle(String name,double speed,int peoples){
        this.name = name;
        this.speed = speed;
        this.peoples = peoples;
    }

    public void drive(){
        System.out.println("我是一个" + this.name);
        System.out.println("我可以容纳"+ this.peoples +"人");
        System.out.println("我的速度是"+ this.speed +"迈");
    }

}
