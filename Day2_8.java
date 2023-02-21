
class SingletonExample {
    
    static SingletonExample s;
private SingletonExample() {}

    public static SingletonExample get() {
        if(s == null)
            s = new SingletonExample();
        return s;
    }
    
    public void TestPrint() {
        System.out.println("In singleton class.");
    }
}

public class Day2_8 {
    public static void main(String[] args) {
        SingletonExample s = SingletonExample.get();
        s.TestPrint();
    }
}