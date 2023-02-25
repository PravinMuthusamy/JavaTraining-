package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno1 {
    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(2);
        PrintNum printnum=new PrintNum();
        es.execute(()->{
            printnum.printeven();
        });
        es.execute(()->{
            printnum.printodd();
        });
        es.shutdown();
    }
}
class PrintNum{
    synchronized void printeven(){
        System.out.println("Even numbers are:");
        for(int even=0;even<=100;even+=2){
            System.out.println(even);
        }
    }
    synchronized void printodd(){
        System.out.println("Odd numbers are:");
        for(int odd=1;odd<100;odd+=2){
            System.out.println(odd);
        }
    }
}
