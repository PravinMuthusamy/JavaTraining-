package day5;

public class Exno8 {
    public static void main(String[] args) {
   
    StringBuffer sb=new StringBuffer("A");
    UserCreatedThread thread1=new UserCreatedThread(sb);
    UserCreatedThread thread2=new UserCreatedThread(sb);
    UserCreatedThread thread3=new UserCreatedThread(sb);
    thread1.start();
    thread2.start();
    thread3.start();     
}
    
}
class UserCreatedThread extends Thread{
    StringBuffer sbr;
    UserCreatedThread(StringBuffer sbr){
        this.sbr=sbr;
    }
    public void run(){
        synchronized(sbr){
            for(int itr=0;itr<=100;itr++){
                System.out.print(sbr+" ");
               }
                int value=sbr.charAt(0);
                value++;
                sbr.replace(0, 1, (char)value+"");
            }
        }
    }

