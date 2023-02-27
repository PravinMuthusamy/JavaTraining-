public class exno6 {
    public static void main(String[] args) {
        BaseClass b=new Subclass();
    }
}
class BaseClass{
    BaseClass(){
        int i=1/0;
        }
       
}

class Subclass extends BaseClass{
    Subclass(){
        try{
            BaseClass bc=new BaseClass();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero at BaseClass.<init>(exno6.java:8)