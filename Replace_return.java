//q3
class A {
    public void mth1(){
        mth2();
        System.out.println("caller");
    }
  
    public void mth2(){
        try{
           // int i=1/0;
            System.exit(0);
        }
        catch(Exception e){System.out.println("catch-mtch2");}
        finally{
            System.out.println("finally-mtch2");
        }
        
    }
 }
   class Replace_return{
        public static void main(String args[])
        {
            A s=new A();
            s.mth1();
        }
    
     }
    