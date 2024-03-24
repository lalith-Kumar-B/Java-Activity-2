/**11. Program with class variable that is available for all instances of a class. Use static variable declaration.
 Observe the changes that occur in the object’s member variable values.
 */ 

package jp;

class StaticVarClass {
    static int staticVariable; // Static variable
    
    int instanceVariable; // Instance variable
    
    StaticVarClass(int value) {
        this.instanceVariable = value;
    }
    
    void display() {
        System.out.println("Instance variable: " + instanceVariable + ", Static variable: " + staticVariable);
    }
}

public class P11_StaticAndInstanceVar {
    public static void main(String[] args) {
        StaticVarClass obj1 = new StaticVarClass(10);
        StaticVarClass obj2 = new StaticVarClass(20);
        
        obj1.display(); 
        obj2.display(); 
        
        StaticVarClass.staticVariable = 5;
        
        obj1.display(); 
        obj2.display(); 
    }
}

