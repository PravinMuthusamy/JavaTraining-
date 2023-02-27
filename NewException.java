//q5
class NewException {
    public static void main(String[] args)throws Exception
    {
        throw new customException();
        
    }
}
class customException extends Exception{

}
// Exception in thread "main" customException
//         at NewException.main(NewException.java:5)