import java.util.Arrays;

public class Day2_1 {
    int x;
    public static void main(String[] args) {
        int n = 2;
        float f = 5.0f;
        Day2_1 d = new Day2_1();
        int []a = new int[] {2, 4, 6, 8, 10};
            System.out.println("Values of n and f before function call : "+n+", "+f);
            forPrimitive(n, f);
            System.out.println("Values of n and f after function call : "+n+", "+f);

            System.out.println("Array values before function call:"+Arrays.toString(a));
            forArray(a);
            System.out.println("Array values after function call:"+Arrays.toString(a));
            
            System.out.println("Value of class member x before function call : "+d.x);
            forObject(d);
            System.out.println("Value of class member x after function call : "+d.x);
        }

        public static void forPrimitive(int n, float f) {
            n += 10;
            f -= 2.5f;
        }

        public static void forArray(int []a) {
            for(int i=0; i<a.length; i++)
                a[i] += 2;
        }

        public static void forObject(Day2_1 d) {
            d.x = 190;
        }
    }

/*
 
Output:
Values of n and f before function call : 2, 5.0
Values of n and f after function call : 2, 5.0
Array values before function call:[2, 4, 6, 8, 10]
Array values after function call:[4, 6, 8, 10, 12]
Value of class member x before function call : 0
Value of class member x after function call : 190

Hence proved that primitive data types are passed by value where as 
objects and arrays are passed by reference.

*/