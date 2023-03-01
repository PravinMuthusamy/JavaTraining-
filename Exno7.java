package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno7 {
    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(1);
        Print print=new Print();
        es.execute(()->{
            print.toPrint();
        });
        es.shutdown();
    }
    
}
class Print{
    void toPrint(){
        for(int i=1;i<100;i++){
            try{
            System.out.println(i);
            
            if(i%10==0)
            {
                System.out.println("Tenth Number");
            }
            Thread.sleep(1000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
            
        }
    }
}