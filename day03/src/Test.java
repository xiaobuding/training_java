/**
 * Created by Administrator on 13-8-10.
 */
public class Test {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("自行车",20,2);
        bike.drive();
        System.out.println("--------------------------------------");
        Vehicle car = new Vehicle("小汽车",120,5);
        car.drive();
    }
}
