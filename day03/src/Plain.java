/**
 * Created by Administrator on 13-8-10.
 */
public class Plain extends Vehicle{
    int wings;//翅膀数

    Plain(String name, double speed, int peoples,int wings){
        super(name,speed,peoples);
        this.wings = wings;
    }
}
