package week2;

// public class HelloWorld {
//     public static void main(String[] args){ /* signature of the main method: jvm will look for this */
//         System.out.println("Hello, world!");
//     }
// }
/* data types */
// public class Main{
//     public static void main(String[] args){
//         int myNumber = 56; /* initialization and declaration in the same line */
//         // int myNumber; /* in different line, both ways are correct */
//         // myNumber = 56;
//         long myNum=2147483648L;

//         long myNumberLong = myNumber; /* this will give a different number */
//         // here variable type is long and the value is int and this is acceptable, coz long is the bigger vessel containing int which is the smaller content

//         int myNumInt = (int) myNum;
//         // here, this will throw an error, coz we are tring to store long in int; so avoid the error, we can use "type casting - (int)" to tell the compiler
//         // that i am aware of this, and by type casting we may lose some information and i am okay with it

//         float myFloat = 3.14f;
//         double myDouble = 4.5;
//         char myChar = 'A';
//         boolean myBoolean = true;

//         String myString="Hello, Java";
//         // string is a class in java, so it comes with capital S

//         System.out.println("Integer: " + myNumber);
//         System.out.println("Long: "+myNum);
//         System.out.println("Float: "+myFloat);
//         System.out.println("Double: "+myDouble);
//         System.out.println("Char: "+myChar);
//         System.out.println("Boolean: "+myBoolean);
//         System.out.println("String: " + myString);
//         System.out.println("Long in int: "+ myNumInt);
//     }
// }

/* arithmetic operations */
// public class Main {
//     public static void main(String[] args){
//         int a = 12;
//         int b = 5;
//         int addition = a+b;
//         System.out.println(a + "+" + b + "=" + addition);
//         int subtraction = a-b;
//         System.out.println(a + "-" + b + "=" + subtraction);
//         int multiplication = a*b;
//         System.out.println(a + "*" + b + "=" + multiplication);
//         int division = a/b; /* 12/5 -> 2 */
//         float div = a/b; /* 12/5 -> 2.0 */
//         float fdivision = (float)a/b; /*  12/5 -> 2.4 */
//         System.out.println(a + "/" + b + "=" + division);
//         System.out.println(a + "/" + b + "=" + div);
//         System.out.println(a + "/" + b + "=" + fdivision);

//         int modulus = a%b; /* remainder */
//         System.out.println(a + "%" + b + "=" + modulus);

//         int increment = a; /* increment operator */
//         increment++;
//         System.out.println(a + " increment is " + increment); /* 13 */
//         System.out.println(a + " increment is " + increment++); /* post increment: 13 */
//         System.out.println(a + " increment is " + increment); /* 14 */
//         System.out.println(a + " increment is " + ++increment); /* pre increment: 15 */

//         int decrement = a; /* decrement operator */
//         decrement--;
//         System.out.println(a + " decrement is " + decrement);

//         // float
//         float x = 15.5f;
//         float y= 4.5f;
//         float fladdition = x+y;
//         System.out.println(x + " + " + y + "=" + fladdition);
//         float flsubtraction = x-y;
//         System.out.println(x + " - " + y + "=" + flsubtraction);
//         float flmultiplication = x*y;
//         System.out.println(x + " * " + y + "=" + flmultiplication);
//         float fldivision = x/y;  /* 3.4444 */
//         float flointdiv = (int) (x/y); /* 3.0 */
//         float fdivi = (int) (x) / (int) (y); /* 3.0 */
//         System.out.println(x + "/" + y + "=" + fldivision);
//         System.out.println(x + "/" + y + "=" + flointdiv);
//         System.out.println(x + "/" + y + "=" + fdivi);

//         float flmodulus = x%y;
//         System.out.println(x + " % " + y + "=" + flmodulus);
        
//     }
// }

/* string */
// public class Main{
//     public static void main(String[] args){
//         String str = "Hello, world!";
        
//         /* length of a string */
//         int length = str.length();
//         System.out.println("Length of the string: "+ length);

//         /* convert to uppercase */
//         String upperCaseStr = str.toUpperCase();
//         System.out.println("Uppercase: "+ upperCaseStr);

//         /* convert to lowercase */
//         String lowerCaseStr = str.toLowerCase();
//         System.out.println("Lowercase: "+lowerCaseStr);

//         /* substring from index 7 */
//         String subStr1 = str.substring(7);
//         System.out.println("Substring from index 7: "+ subStr1);

//         /* substring from index 0 to 5 */
//         String subStr2 = str.substring(0,5);
//         System.out.println("Substring from index 0 to 5: "+ subStr2);

//         /* replace world with java */
//         String replacedStr = str.replace("world", "Java");
//         System.out.println("Replaced string: "+ replacedStr);

//         /* check if the sstring contains 'World' */
//         boolean containsWorld = str.contains("world");
//         System.out.println("Contains 'World': "+ containsWorld);

//         /* check if the sstring starts with Hello */
//         boolean startsWithHello = str.startsWith("Hello");
//         System.out.println("Starts with 'hello': "+ startsWithHello);

//         /* check if the string ends with ! */
//         boolean endswith = str.endsWith("!");
//         System.out.println("Ends with '!': " + endswith);

//         /* trim the string- removing leading and trailing spaces */
//         String strr = "   Hi   ";
//         String trimmedstr = strr.trim();
//         System.out.println("Trimmed string: " + trimmedstr);

//         /* splitthe string by comma */
//         String[] splitstr = str.split(",");
//         System.out.println("split string by comma: ");
//         for (String part: splitstr){
//             System.out.println(part.trim());
//         }

//         /* find the index of the world */
//         int indexofWorls = str.indexOf("world");
//         System.out.println("Index of world: "+ indexofWorls);

//         /* concatenate with another string */
//         String concatenatedStr = str.concat("Welcome to Java!");
//         System.out.println("Concatenated string: "+ concatenatedStr);


//     }
// }

/* array */
public class Main {

    public static void main(String[] args){
        int[] intArr = {10,20,30,40};

        // print the elements of the array
        System.out.println("Elements of intArr: ");
        for (int i=0;i<intArr.length; i++){
            System.out.println(intArr[i]+ " ");
        }
        // System.out.println();
        // find the length of the array
        int length = intArr.length;
        System.out.println("Length of intArr: "+length);

        /* accessing elements of the array */
        int firstElement = intArr[0];
        int lastElement = intArr[intArr.length-1];
        System.out.println("First element: "+ firstElement);
        System.out.println("Last element: "+ lastElement);

        /* modify an element of the array */
        intArr[2]=35;
        System.out.println("Elements of intArr after modification: ");
        for (int i=0;i<intArr.length; i++){
            System.out.println(intArr[i]+" ");
        }
        // System.out.println(); this line give a line space after the output

        /* sum of all elements in the arry */
        int sum=0;
        for (int i=0;i<intArr.length;i++){
            sum += intArr[i];
        }
        System.out.println("sum of all elements: " + sum);

        /* declare and initialize an array of strings */
        String[] strArr = {"Java","is","fun"};

        /* print the elements od the string array */
        System.out.println("elements of strArr: ");
        for (int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]+" ");
        }
        System.out.println();



    }
}

