class Pen {/* class contains the properties and the below color type are properties */
    String color;
    String type; /* ballpoint, gel */

    public void write(){/* this is a method/function */
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age; 

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){/* parameterizeed constructor */
        this.name = name;
        this.age = age;
    }
}




public class oops {/* this is the main function and this class is diff
    from the above pen class */
    public static void main(String args[]){/* this line is default */
        // Pen pen1 = new Pen();/* here we are creating a pen object with the help of blueprint Pen */
        // pen1.color = "blue"; /* assigning values to the properties */
        // pen1.type="gel";
        // pen1.write();/* calling the method */

        // Pen pen2 = new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();
        Student s1 = new Student("kavi",25); /* here Student() is the constructor and Student with the arguments is the parameterized constructor */
        // s1.name="kavi";
        // s1.age=25;

        s1.printInfo();

    }

}