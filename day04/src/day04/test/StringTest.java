package day04.test;

/**
 * Created by Administrator on 13-8-11.
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(a.hashCode());
        String b = new String("abc");
        System.out.println(b.hashCode());
        System.out.println(a==b);
    }
}
