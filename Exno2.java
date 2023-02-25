package day5;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exno2 {
    public static void main(String[] args) {
        Printmsg pm=new Printmsg();
        ExecutorService es=Executors.newFixedThreadPool(3);
        es.execute(()->{
            pm.messageprint("----");
        });
        es.execute(()->{
            pm.messageprint("Message");
        });
        es.execute(()->{
            pm.messageprint("----");
        });
        es.shutdown();
    }
}
class Printmsg{
    synchronized void messageprint(String msg){
       System.out.print(msg);
    }
}