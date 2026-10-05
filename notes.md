oops.java  --> VScode
OOPS in Java -> collanote

class- bluprint -->start with capital letter
string, int- properties
void - methods(actions) ---> start with small letters

the filename and the public class should be the one and same, if not error will come, so when a class is declared with public, the file nae should match with the declared class name

#every object will be associated with some methods and properties

Constructors: 
* they dont return anything
* construtors are called only when an object is created
* class name and constructor name should be the same
    1. Non-parameterized constructors
    2. Parameterized constructors
    3. Copy construction
    - for explanation, see collanote file

class → blueprint
object → actual thing
constructor → gives the object its initial values
method → makes the object perform an action

polymorphism:
* COMPILETIME POLYMORPHISM
- same method name but with different parameters, and every variation can be called independentaly
- method overloading

inheritance:
- subclass will inherit all the properties/functions from the parent class and in addition to that, subclass can have its own properties
1. Single inheritance: 1 and 2 ; parent->child
2. Multilevel inheritance: 1,2 and 3; grandparent->parent->child
3. Hierarchical inheritance: 1,2 and 4; parent-> child 1, child 2
4. Hybrid inheritance: combined version of all the above 3
5. Multiple iheritance: parent 1, parent 2 -> child; only allowed with the help of interfaces

encapsulation:
- keeping data and methods that operate on that data together inside a class, while restricting direct access to the data
- dont allow outside code to directly change important data, give controlled access through methods
