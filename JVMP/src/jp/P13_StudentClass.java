/**13. Program to create a student class with following attributes; 
Enrollment No: Name, Mark of sub1, Mark of sub2, mark of sub3, TotalMarks.
The three marks must be calculated only when the student passes in all three subjects. 
The pass mark for each subject is 50. If a candidate fails in any one of the subjects, his total mark must be declared as zero. 
Using this condition write a constructor for this class. Write separate functions for accepting and displaying student details. 
In the main method create an array of three student objects and display the details.*/ 

package jp;

import java.util.Scanner;

class Student{
	int EnrollNo;
	String Name;
	int sub1,sub2,sub3,TotalMarks;
	
	int getTotalMarks(){
		if(this.sub1 >= 50 && this.sub2 >= 50 && this.sub3 >= 50) {
			return this.sub1 + this.sub2 + this.sub3;
		}else {
			return 0;
		}
	}
	Student(int elNo,String name, int s1, int s2, int s3) {
		this.EnrollNo = elNo;
		this.Name = name;
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
		this.TotalMarks = getTotalMarks();
	}
	
	void display() {
		System.out.println("Name : "+this.Name);
		System.out.println("Subject 1 : "+this.sub1);
		System.out.println("Subject 2 : "+this.sub2);
		System.out.println("Subject 3 : "+this.sub3);
		System.out.println("Total Marks : "+this.TotalMarks);
	}
}

public class P13_StudentClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Student[] students = new Student[3];
		
        for (int i = 0; i < students.length; i++) {
        	
            System.out.println("Enter details for student " + (i + 1));
            
            System.out.print("Enrollment No: ");
            int enrollmentNo = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Mark of sub1: ");
            int markSub1 = in.nextInt();
            System.out.print("Mark of sub2: ");
            int markSub2 = in.nextInt();
            System.out.print("Mark of sub3: ");
            int markSub3 = in.nextInt();

            students[i] = new Student(enrollmentNo, name, markSub1, markSub2, markSub3);
        }

        System.out.println("Student details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nDetails of student " + (i + 1));
            students[i].display();
        }
        in.close();
	}

}
