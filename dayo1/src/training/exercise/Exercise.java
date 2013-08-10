package training.exercise;

import java.util.Scanner;

/**
 * Created by jiangxu on 13-8-4.
 */
public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要查看的题目数？（1-50查看题目，99退出）：");
            int itemNum = scanner.nextInt();
            switch (itemNum) {
                case 1:
                    //
                    exercise.rabbits();//单位：对
                    break;
                case 2:
                    exercise.primeNum(); //输出101--200之前的素数
                    break;
                case 4:
                    exercise.primeFactor();
                    break;
                case 5:
                    //【程序5】题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
                    exercise.scoreABC();
                    break;
                case 6:
                    //【程序6】题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
                    exercise.commonMultiple();
                    break;
                case 7:
                    exercise.findChar();
                    break;
                case 9:
                    exercise.findWanshu();
                    break;
                case 11:
                    //【程序11】题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
                    // 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
                    exercise.concatNum();
                    break;
                case 99:
                    return;
                default:
                    System.out.println("该题目还没有完成，请选择其它题目查看！");
                    break;
            }
        }
    }

    /**
     * 题目001:
     * 输入月份数
     * 返回该月份拥有兔子的对数
     * 思路：只有隔一个月的兔子才会繁殖，所以只有n-2月份的兔子数会增加，
     * n-1比n-2月份多出来那部分不会增加。
     * 结论：当月的兔子数目=前两个月的兔子数目之和
     */
//    void rabbits() {
//        int a = 0;
//        int b = 1;
//        int count = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您要查看的月份？：");
//        int month = scanner.nextInt();
//
//        //从二月份开始进入for循环
//        //第一个月直接跳过循环 返回count=1
//        for(int i=2;i<=month;i++){
//            count = a+b;/*当月的兔子数等于前两个月的兔子数的和*/
//            a = b;
//            b = count;
//        }
//        System.out.println("第 " + month + " 月的兔子总数为 " + count + " 对！");
//    }

    /**
     * 第二种方法，调用递归的方法
     */
    void rabbits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查看的月份？：");
        int month = scanner.nextInt();

        int count = this.countRabbits(month);

        System.out.println("第 " + month + " 月的兔子总数为 " + count + " 对！");
    }

    /**
     *
     */
    void primeNum(){
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            int j;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i / 2 + 1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("101到200之间的素数总个数为：" + count);
    }

    /**
     * 004
     * 对输入的正整数分解质因数
     */
    void primeFactor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个要分解质因数的正整数：");
        int num = scanner.nextInt();
        System.out.print(num + " = ");
        findFactor(num);
    }

    /**
     * 005
     */
    void scoreABC() {
        System.out.println("请输入同学的成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score>=90 && score<=100) {
            System.out.println("您的成绩为： A");
        }else if(score>=60 && score<=89){
            System.out.println("您的成绩为： B");
        }else if(score<60 && score>=0){
            System.out.println("您的成绩为： C");
        }else{
            System.out.println("输入不在分数范围内！");
        }
    }

    /**
     * 006
     */
    void commonMultiple(){
        System.out.println("输入m ：");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("输入n ：");
        int n = scanner.nextInt();

        int minTmp = m<n ? m : n;
        int maxTmp = m>n ? m : n;

        for(int i= minTmp; i>0; i--){
            if(m%i == 0 && n%i == 0){
                System.out.println("最大公约数为： " + i);
                System.out.println("最小公倍数为： " + m*n/i);
                break;
            }
        }
    }

    /**
     *  007
     */
    void findChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input...");
        String s = scanner.nextLine();
//        String s = "adad23434367896786&*( (&*(啦啦 啦等等 ddd";
        char[] chs = s.toCharArray();
        int spaceCount = 0;
        int charUpCount = 0;
        int charDownCount = 0;
        int numCount = 0;
        int symbolCount = 0;
        int otherCount = 0;
        //直接用chs[i] > 'a'   chs[i] > '0'这种格式就行了，傻了。。。
        for (int i = 0; i < chs.length; i++) {
            if(chs[i] == 32){
                spaceCount++;
            }else if(chs[i]>=33 && chs[i]<=126){
                if(chs[i]>=48 && chs[i]<=57){
                    numCount++;
                }else if(chs[i]>=97 && chs[i]<=122){
                    charDownCount++;
                }else if(chs[i]>=65 && chs[i]<=90){
                    charUpCount++;
                }else{
                    symbolCount++;
                }
            } else {
                //中文？？
                otherCount++;
            }
        }
        System.out.println("空格数为：" + spaceCount);
        System.out.println("大写英文字母数：" + charUpCount);
        System.out.println("小写英文字母数：" + charDownCount);
        System.out.println("数字数：" + numCount);
        System.out.println("符号数：" + symbolCount);
        System.out.println("其他类型字符数：" + otherCount);
    }

    /**
     * 【程序9】题目：一个数如果恰好等于它的因子之和，这个数就称为’完数’。例如6=1＋2＋3.编程 找出1000以内的所有完数。
     */
    void findWanshu(){
        for(int i=1; i<= 1000; i++){
            int count = 0;
            for(int j = 1; j <= i/2; j++){
                if(i%j == 0){
                    count = count + j;
                }
            }

            if(count == i){
                System.out.println(i);
            }
        }
    }

    /**
     * 011
     */
    void concatNum(){
        int count = 0;
        for(int i = 1; i < 5; i++){
            int sum;
            int sum3;
            int sum2;
            int sum1;
            sum3 = i * 100;
            for (int j = 1; j < 5; j++) {
                if(j != i){
                    sum2 = j * 10;
                    for (int k = 1; k < 5; k++) {
                        if(j != k && k != i){
                            sum1 = k;
                            sum = sum1 + sum2 + sum3;
                            System.out.println(sum);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("count: " + count);
    }


    /**
     * 001的递归实现
     * @param month   月数
     * @return 当月的兔子对数
     */
    private int countRabbits(int month){
        int count = 1;
        if(month >= 3){
            count = countRabbits(month-1)+countRabbits(month-2) ;
        }
        return count;
    }
    /**
     *针对004的递归调用方法
     * @param num
     */
    private void findFactor(int num) {
        for (int i=2; i<= num; i++){
            if(num%i == 0){
                if(num == i){
                    System.out.println(i);
                }else{
                    System.out.print(i + "*");
                    findFactor(num/i);
                    break;
                }
            }
        }
    }

    /**
     *针对009的递归调用方法
     * @param num
     */
    private int sumFactor(int num) {
        int sumFactors = 0;
        for (int i=2; i<= num; i++){
            if(num%i == 0){
                if(num > i){
                    findFactor(num/i);
                    break;
                }
                sumFactors += i;
            }
        }
        return sumFactors;
    }
}