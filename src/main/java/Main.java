import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        String gradingMethod = "SLIGHT"; // <---- simply change this value to change the way grades are curved
        StudentGradeTranslator gradeTranslator = new StudentGradeTranslator();

        HashMap<String, String> studentGrades = new HashMap<String, String>();
        studentGrades.put("Jamaal", "93");
        studentGrades.put("Jennifer", "87");
        studentGrades.put("Jules", "59");

        // get all the student and their grades using each entry
        System.out.println("List of students and their grades:");
        for (Entry<String, String> studentGrade: studentGrades.entrySet()) {
            System.out.println(studentGrade.getKey() + "'s grade is " +
                    gradeTranslator.getLetterGrade(Integer.parseInt(studentGrade.getValue())));
            System.out.println("Passing grade status: " + gradeTranslator.isPassingGrade(Integer.parseInt(studentGrade.getValue())));
            System.out.println("The Student will need an additional " 
            + gradeTranslator.gradeCalculator.howManyForNextLetterGrade(Integer.parseInt(studentGrade.getValue())) + 
            " for the next letter grade.");
        }
    }
}



// Using the code we wrote together in the previous lesson as a baseline, 
// create a new method in the GradeCalculator interface that will return the number 
// of grade points needed for the numeric grade passed in to map to the next letter grade. 
// Let's call this method howManyForNextLetter() - here is its signature:

// public int howManyForNextLetterGrade(int numberGrade);

// For example, if numberGrade is 67, then this method will return 3
//  if the grading method is "heavy", it will return 8 if the grading 
//  method is "slight" and 3 is the grading method is "flat".