package day5;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exno2 {
    public static void main(String[] args) {
        PrintMsg printmessage=new PrintMsg();
        ExecutorService es=Executors.newFixedThreadPool(3);
        es.execute(()->{
            printmessage.messagePrint("----");
        });
        es.execute(()->{
            printmessage.messagePrint("Message");
        });
        es.execute(()->{
            printmessage.messagePrint("----");
        });
        es.shutdown();
    }
}
class PrintMsg{
    synchronized void messagePrint(String msg){
       System.out.print(msg);
    }
}