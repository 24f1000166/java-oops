package week2;

//public class Flow {
    // public static void main(String[] args){
    /* given: to print how the numbers are related, >,<,= */
    // int a = 20;
    // int b = 20;

    // if (a>b){
    //     System.out.println("a is greater than b");
    // } else if (b>a){
    //     System.out.println("b is greater than a");
    // } else {
    //     System.out.println("both are equal");
    // }

    /* for loop */
    // for (int i=1; i<=5; i++){
    //     i++;
    //     System.out.println("i = " + i);
    // }
    /* enhanced for loop */
    // int[] intArr = {10,20,30};

    // System.out.println("elements- for loop: ");
    // for (int i=0;i<intArr.length;i++){
    //     System.out.println(intArr[i]+ " ");
    // }
    // System.out.println("elements- enhanced for loop: ");
    // for (int element: intArr){/* useful when expecting only a specific datatype output */
    //     System.out.println(element+" ");
    // }

    /* while loop */
    // int num = 1;
    // while (num<=5){
    //     System.out.println(num);
    //     num++;
    // }

    /* do-while loop */
    // int num=6; 
    // do {
    //     System.out.println(num);
    //     num++;
    // } while (num<=3);

    /* switch */
    // int day = 4; 
    // String dayName;
    // switch (day){ /* here day corresponds to the input, so according to input, we will have the respective outcomes */
    //     case 1:
    //         dayName = "Monday";
    //         break; /* will come out of the loop, if this block ran */
    //     case 2:
    //         dayName = "Tuesday";
    //         break; /* if the break is not here, then the output will combine with the next block, which iwll result in false outputs, so dont forget the break */
    //     case 3:
    //         dayName = "Wednesday";
    //         break;
    //     default: /* if the inputs doesnt match, this will takes place */
    //         dayName = "Invalid day";
    //         break;
    // }
    // System.out.println("Day " + day + " is " + dayName);
// }
//}

// public class Flow{
//     public static int add(int a, int b){
//         return a+b;
//     }
//     public static void main(String[] args){
//         int a = 2;
//         int b = 4;
//         int sum = add(a, b); /* here add is a method inside the same class */
//         System.out.println("Sum is: " + sum);
//     }
// }

class Calculator {
    public static int add(int a, int b){/* static makes the reference possible inside another another class without creatign an object */
        return a+b;
    }
}
public class Flow{
    public static void main(String[] args){
        int x = 2;
        int y = 4;
        int sum = Calculator.add(x,y); /* here we are using a method of another class inside another class */
        /* so, classname.method() and this is only possible when the method is static, if add is not a static method, we cant reference it*/
        System.out.println("Sum is: "+ sum);
        

    }
}