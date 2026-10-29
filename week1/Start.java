package week1;

// // public class Start{
// class Main{
//      public static void main(String[] args){/* main is the method name and the whole line is the method  */
//         //  System.out.println("Hello world");
//          System.out.println(args[0]);/* takes input from command line and publish that */
//         //  B.hello();
//  }
//  }
 
// class B{
//     public static void hello(){
//         System.out.println("this is from class B");
//     }
// }
// public class Start{
//     public static void main(String[] args){
//         int total=10;
//         totl=total+20; /* this will throw error while compiling itself; compiler error */
//         System.out.println("Final total:" + total);
//     }
// }

// public class Start{
//     public static void main(String[] args){
//         Animal animal1=new Animal();/* instance of class animal */
//         Dog dog1=new Dog();
//         Animal animal2=new Animal();
//         animal1.walk();
//         dog1.walk();
//     }
// }
// /* below is just a template to create instances/objects of this class */
// class Animal{/* superclass */
//     String name;/*a data of the class */
//     public void walk(){/*a method of the class */
//         System.out.println("walking");
//     }
// }
// /* inheritance */
// class Dog extends Animal{/* subclass */
// }

/* example of stack, last in first out */
// public class Start{
//     // recursive method to calculate factorial
//     public static int factorial(int n){
//         if (n==0){
//             return 1;
//         } else{
//             return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args){
//         int input=3;
//         int result=factorial(input);
//         System.out.println("Factorial of "+input+" is: "+result);
//     }
// }

class BankAccount{
    /* instance variables: stored in HEAP inside the BankAccount object */
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance){
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
    }
    public void depositBonus(double baseBonus){
        double multiplier=1.5; /* stack */
        double finalBonus=baseBonus*multiplier;
        this.balance += finalBonus;
    }
    public void display(){
        System.out.println("Account #"+accountNumber + " | Balance: $" + balance);
    }
}
public class Start{
    public static void main(String[] args){
        //local primitive: stored in main() STACK frame
        int accountID=1001;

        // local reference: 'accountRef' is on STACK; new object is on HEAP
        BankAccount accountref = new BankAccount(accountID,500.0);
        accountref.depositBonus(20.0);
        accountref.display();
    }
}