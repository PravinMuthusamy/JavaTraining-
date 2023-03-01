package day5;

public class Exno5 {
    public static void main(String[] args) {
        Thread thread1=new Thread();
        thread1.start();
        System.out.println(thread1);
        thread1.start();
    }
}
