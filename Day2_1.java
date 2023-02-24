import java.util.Arrays;

public class Day2_1 {
    int global;
    public static void main(String[] args) {
        int num = 2;
        float floatVar = 5.0f;
        Day2_1 d = new Day2_1();
        int []arr = new int[] {2, 4, 6, 8, 10};
            System.out.println("Values of num and floatVar before function call : "+num+", "+floatVar);
            forPrimitive(num, floatVar);
            System.out.println("Values of num and floatVar after function call : "+num+", "+floatVar);

            System.out.println("Array values before function call:"+Arrays.toString(arr));
            forArray(arr);
            System.out.println("Array values after function call:"+Arrays.toString(arr));
            
            System.out.println("Value of class member global before function call : "+d.global);
            forObject(d);
            System.out.println("Value of class member global after function call : "+d.global);
        }

        public static void forPrimitive(int num, float floatVar) {
            num += 10;
            floatVar -= 2.5f;
        }

        public static void forArray(int []arr) {
            for(int i=0; i<arr.length; i++)
                arr[i] += 2;
        }

        public static void forObject(Day2_1 d) {
            d.global = 190;
        }
    }

/*
 
Output:
Values of num and floatVar before function call : 2, 5.0
Values of num and floatVar after function call : 2, 5.0
Array values before function call:[2, 4, 6, 8, 10]
Array values after function call:[4, 6, 8, 10, 12]
Value of class member global before function call : 0
Value of class member global after function call : 190

Hence proved that primitive data types are passed by value where as 
objects and arrays are passed by reference.

*/