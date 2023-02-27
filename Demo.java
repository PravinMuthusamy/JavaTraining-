//q2
class B {
    public void mth1(){
        mth2();
        System.out.println("caller");
    }
  
    public void mth2(){
        try{
           // int i=1/0;
            return;
        }
        catch(Exception e){System.out.println("catch-mtch2");}
        finally{
            System.out.println("finally-mtch2");
        }
        
    }
 }
class Demo
   {
        public static void main(String args[])
        {
            B s=new B();
            s.mth1();
        }
    
     }
    