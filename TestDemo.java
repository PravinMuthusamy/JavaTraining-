//q4
public class TestDemo {
    public static void main(String[] args)
    {
        try{
            throw new UserDefinedException();
        }
        catch(UserDefinedException ae){
            ae.printStackTrace();
        }
    }
}
 class UserDefinedException extends Exception{
    
}
