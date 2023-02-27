//q4
public class TestDemo {
    public static void main(String[] args)
    {
        try{
            throw new UserDefinedException("error");
            
        }
        catch(UserDefinedException ae){
            // ae.printStackTrace();
            // ae.getMessage();
           // System.out.println("error");
           
    }
}
}
 class UserDefinedException extends Exception{
  
     UserDefinedException(String str){
      
        System.out.println(str);
    }

  }



