package week2;



class Employee{ // a class or a template
    String name; //instance variable
    int age;

    /* Employee(String n, int a){ //parameterised constrctor
        name = n;
        age= a;
    }
    Employee(){//default constructor or no-argument constructor
        name= "ajs";
        age = 0;
    }
    Employee(String n){//constructor overloading
        name = n;
        age = 0;
    } */

    Employee(String name, int age){ 
        /* name=name; //if we initialize with the instance variables itself, it wont update with the given inputs, it will give o/p as null and 0
        age=age; */
        this.name = name;
        this.age = age; //here lhs refers to the instance varible of the object of the class(hre e,e1,e2), rhs to the given  name
    }

    Employee(Employee other){ //copy constructor, 
        this.name = other.name; //ecopy.name = e.name
        this.age = other.age; //ecopy.age=e.age 
    }
   
    
    void displayName(){ //return type is void as it is not returnng anything
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }
    void setName(String n){
        name=n;
    }
    String getName(){
        return name;
    }
    
}

class second{
    public static void main(String[] args){
        Employee e= new Employee("Kavi",25);
        e.setName("mukil"); //kavi will update to mukil
        System.out.println(e.getName());
        // e is of the type Employee, lke a varible with the datatype
        /* Employee e = new Employee("kavi",25); //this will create an emmployee object
        Employee ecopy = new Employee(e); //copy */
        /* Employee e2 = new Employee();
        Employee e3 = new Employee("mukil"); */
        /* e.displayAge(); //output: 0 (before constructor); 25 (after constructor)
        e.displayName(); */ //output: null (before constructor); kavi (after constructor)
        /* e2.displayAge();
        e2.displayName();
        e3.displayAge();
        e3.displayName(); */
        /* ecopy.displayAge();
        ecopy.displayName(); */
    }
}

