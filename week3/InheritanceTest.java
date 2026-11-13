package week3;

class Employee {
	  private String name;
	  private double salary;

	  //constructor with two arguments to set the value for name and salary
	  public Employee(String n, double s) {
	    this.name = n;
	    this.salary = s;
	  }
//setters
	  public void setName(String n) {
	    this.name = n;
	  }
	  public void setSalary(double s) {
	    this.salary = s;
	  }
//getters
	  public String getName() {
	    return this.name;
	  }
	  public double getSalary() {
	    return this.salary;
	  }
//bonus method to find the bonus
	  public double bonus(float percent){
	    return(percent/100.0)*salary;
	  }
	}

	class Manager extends Employee {
	  private String secretary;

//constructor with three arguments
	  public Manager(String n, double s, String sec) {
	    super(n, s); //this is a call to superclass matching Employee constructor
	    this.secretary = sec;
	  }

	  public void setSecretary(String sec) {
	    this.secretary = sec;
	  }

	  public String getSecretary() {
	    return this.secretary;
	  }

	  //bonus method-> method overriding: giveing a new defintion for method from the parent class;
	  public double bonus(float percent) { //method name and return is same with the method from parent class; only the content inside changes
	    double b = super.bonus(percent); /* hre we are calling bonus method of parent emplotee class */
	    
	    return (1.5 * b);
	  }
	}
public class InheritanceTest {
	public static void main(String [] args){
		//employee object
		Employee e1 = new Employee("mukil", 250000);
/* Employee-> data type of the object; e1--> this is the reference variable and stored in stack and it is called the address of the object;
rhs is the object created and e1 points to that*/
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());

		//manager object
		Manager m1 = new Manager("kavi", 25000, "mukil");
		System.out.println(m1.getName());
		System.out.println(m1.getSalary());
		System.out.println(m1.getSecretary());
		System.out.println(m1.bonus(50));

		Employee obj = new Manager("nive", 50000, "ak");
		/* parent class reference varible; rhs is the childclass object */
		//trying to call all manager methods
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
		//System.out.println(obj.getSecretary()); /* this throws an error-compilation/syntax error */
		/* even though rhs is a manager object, the employee is the reference varible, so methods in the reference varible will only be allowed */
/* typecasting */System.out.println(((Manager)obj).getSecretary());
		//here we are creating a temp reference, which makes the object to look at the method from manager type
		System.out.println(obj.bonus(50));
		/* eventhough employee have bonus, managers bonus will execute coz during runtime, it will create the manager object and there is a 
		method inside the object which overides the parent, so that method is taken */


	}
}
