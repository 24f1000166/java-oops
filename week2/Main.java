package week2;

// public class HelloWorld {
//     public static void main(String[] args){ /* signature of the main method: jvm will look for this */
//         System.out.println("Hello, world!");
//     }
// }
public class Main{
    public static void main(String[] args){
        int myNumber = 56; /* initialization and declaration in the same line */
        // int myNumber; /* in different line, both ways are correct */
        // myNumber = 56;
        long myNum=2147483648L;
        float myFloat = 3.14f;
        double myDouble = 4.5;
        char myChar = 'A';
        boolean myBoolean = true;

        String myString="Hello, Java";
        // string is a class in java, so it comes with capital S

        System.out.println("Integer: " + myNumber);
        System.out.println("Long: "+myNum);
        System.out.println("Float: "+myFloat);
        System.out.println("Double: "+myDouble);
        System.out.println("Char: "+myChar);
        System.out.println("Boolean: "+myBoolean);
        System.out.println("String: " + myString);








    }
}