package training.exercise;

/**
 * Created by jiangxu on 13-8-4.
 */
public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        int rabbits = exercise.rabbits(7);//单位：对
        System.out.println(rabbits);
    }

    /**
     * 题目001:
     * @param month
     * 输入月份数
     * @return
     * 返回该月份拥有兔子的对数
     * 思路：只有隔一个月的兔子才会繁殖，所以只有n-2月份的兔子数会增加，
     * n-1比n-2月份多出来那部分不会增加。
     * 结论：当月的兔子数目=前两个月的兔子数目之和
     */
    int rabbits(int month) {
        int a = 0;
        int b = 1;
        int count = 1;

        //从二月份开始进入for循环
        //第一个月直接跳过循环 返回count=1
        for(int i=2;i<=month;i++){
            count = a+b;/*当月的兔子数等于前两个月的兔子数的和*/
            a = b;
            b = count;
        }
        return count;
    }
}
