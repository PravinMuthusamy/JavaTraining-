package Ex4;
public class SingletonPattern {
    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        System.out.println(singleton);
        SingletonExample singleton1 = SingletonExample.getInstance();
        System.out.println(singleton1);
        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println(singleton2);
    }
}
class SingletonExample {

    static SingletonExample singleton=null;
private SingletonExample() {
}

    public static SingletonExample getInstance() {
        if(singleton == null)
            singleton = new SingletonExample();
        return singleton;
      }
    
    }


