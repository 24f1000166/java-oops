// class Pen {/* class contains the properties and the below color type are properties */
//     String color;
//     String type; /* ballpoint, gel */

//     public void write(){/* this is a method/function */
//         System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }

// class Student {
//     String name;
//     int age; 

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(String name, int age){/* parameterizeed constructor */
//         this.name = name;
//         this.age = age;
//     }
// }




// public class oops {/* this is the main function and this class is diff
//     from the above pen class */
//     public static void main(String args[]){/* this line is default */
//         // Pen pen1 = new Pen();/* here we are creating a pen object with the help of blueprint Pen */
//         // pen1.color = "blue"; /* assigning values to the properties */
//         // pen1.type="gel";
//         // pen1.write();/* calling the method */

//         // Pen pen2 = new Pen();
//         // pen2.color="black";
//         // pen2.type="ballpoint";

//         // pen1.printColor();
//         // pen2.printColor();
//         Student s1 = new Student("kavi",25); /* here Student() is the constructor and Student with the arguments is the parameterized constructor */
//         // s1.name="kavi";
//         // s1.age=25;

//         s1.printInfo();

//     }

// }

// /* polymorphism */

// class Student {
//     String name;
//     int age;
// /* here same functin/method name but with different parameters-> method overloading->compiletime overloading */
//     public void printInfo(String name) {
//         System.out.println(name);/* 1 */
//     }
//     public void printInfo(int age) {
//         System.out.println(age);/* 2 */
//     }
//     public void printInfo(String name, int age) {
//         System.out.println(name + " "+ age);/* 3 */
//     }
//     // public void printInfo(String name){
//     //     System.out.println(age+" " + name);/* 4 */
//     // }/* so here, in 4. even though o/p is different from 1, we have the same funciton name with same parameter
//     // which is a duplicate method, and it will throw error */
// }

// public class oops {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name="kavi";
//         s1.age=25;

//         s1.printInfo(s1.name);/* 1 */
//         s1.printInfo(s1.age);/* 2 */
//         s1.printInfo(s1.name, s1.age);/* 3 */
//     }
// }

/* INHERITANCE */

class Shape{/* 1 */
    public void area() {
        System.out.println("displays area")
    }
}

class Triangle extends Shape{/* 2 */
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle {/* 3 */
    public void area(int s){
        System.out.println(1/2*s*s);
    }
}

class Circle extends Shape {/* 4 */
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class oops {
    public static void main(String args[]) {
        Triangle t1= new Triangle();

    }
}