package day5;

public class Exno8 {
    public static void main(String[] args) {
   
    StringBuffer sb=new StringBuffer("A");
    Threads thread1=new Threads(sb);
    Threads thread2=new Threads(sb);
    Threads thread3=new Threads(sb);
    thread1.start();
    thread2.start();
    thread3.start();     
}
    
}
class Threads extends Thread{
    StringBuffer sbr;
    Threads(StringBuffer sbr){
        this.sbr=sbr;
    }
    public void run(){
        synchronized(sbr){
            for(int itr=0;itr<=100;itr++){
                System.out.println(sbr+" ");
               }
               System.out.println();

                int value=sbr.charAt(0);
                value++;
                sbr.replace(0, 1, (char)value+"");
            }
        }
    }

