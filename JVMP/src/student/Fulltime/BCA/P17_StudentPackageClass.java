/**17. Create a package ‘student. Fulltime. BCA ‘in your current working directory 
a. Create a default class student in the above package with the following attributes: Name, age, sex. 
b. Have methods for storing as well as displaying */ 

package student.Fulltime.BCA;

public class P17_StudentPackageClass {
    private String name;
    private int age;
    private char sex;

    // Constructor
    public P17_StudentPackageClass(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Method to store student information
    public void storeStudentInfo(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
    
    public static void main(String[] args) {
    	P17_StudentPackageClass s = new P17_StudentPackageClass("lalith",19,'M');
    	s.displayStudentInfo();
    }
}
//OUTPUT
/**
Name: lalith
Age: 19
Sex: M
 */


