class A{
    A() {
        System.out.println("Constructor of A!");
    }
}

class B{
    B() {
        System.out.println("Constructor of B!");
    }
}

class C extends A{
    B obj = new B();
}

public class Day2_10 {
    public static void main(String[] args) {
        C object = new C();
    }
}

/*

Observation - 

Output:
Constructor of A!
Constructor of B!

The constructor of A is called first as we are starting off with creating an object of Class C
that extends A that follows the creation of the object of class B.

*/