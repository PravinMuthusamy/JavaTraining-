//q2
  class Sample {
    public void mth1(){
        mth2();
        System.out.println("caller");
    }
  
    public void mth2(){
        try{
            //throw new Exception("throws IOEception");
            return;
        }
        catch(Exception e){System.out.println("catch-mtch2");}
        finally{
            System.out.println("finally-mtch2");
        }
        
    }
 }
   class test{
        public static void main(String args[])
        {
            Sample s=new Sample();
            s.mth1();
        }
    
     }
     
