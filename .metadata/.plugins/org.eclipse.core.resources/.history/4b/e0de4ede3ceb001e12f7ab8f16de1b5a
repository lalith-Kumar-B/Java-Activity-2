//15. Define a class called first year with above attributes and define a suitable constructor. Also write a method called best Student () which process a first-year object and return the student with the highest total mark. In the main method define a first-year object and find the best student of this class 

package jp;

class FirstYear {
    String className;
    String staffName;
    int numStudents;
    String[] students;

    public FirstYear(String className, String staffName, int numStudents, String[] students) {
        this.className = className;
        this.staffName = staffName;
        this.numStudents = numStudents;
        this.students = students;
    }

    public String bestStudent() {
        int highestTotalMarks = -1;
        String bestStudent = "";

        for (String student : students) {
            String[] studentInfo = student.split(" ");
            int totalMarks = Integer.parseInt(studentInfo[1]);

            if (totalMarks > highestTotalMarks) {
                highestTotalMarks = totalMarks;
                bestStudent = studentInfo[0]; 
            }
        }

        return bestStudent;
    }
}

public class P15_BestStudent {
    public static void main(String[] args) {
   
        String[] BcaStudents = {
            "LALITH 450",
            "LALITH2.0 480",
            "LALITH3.0 430",
        };
        
        FirstYear bcaFirstYear = new FirstYear("BCA", "Mr. Melwyn", BcaStudents.length, BcaStudents);
        
        String bestStudent = bcaFirstYear.bestStudent();

        System.out.println("The best student in " + bcaFirstYear.className + " class is: " + bestStudent);
    }
}
//OUTPUT
//The best student in BCA class is: LALITH2.0
