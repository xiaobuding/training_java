import java.util.Scanner;

/**
 * Created by Administrator on 13-8-4.
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的成绩（0--100）：");

        int a = scanner.nextInt();
        System.out.println(a);
        if(a>0 && a<60){
            System.out.println("不好意思，你的成绩不及格，还需要再努力一把！\n您的分数为：" + a);
        }else if (a >= 60 && a < 80) {
            System.out.println("恭喜你！你的成绩为优良。\n您的分数为：" + a);
        } else if (a >= 80 && a <= 100) {
            System.out.println("太棒了！你的成绩是优秀！\n您的分数为：" + a);
        } else {
            System.out.println("别闹了！您输入的是什么啊？？");
        }

    }
}
