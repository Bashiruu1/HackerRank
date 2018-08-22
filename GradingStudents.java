import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     If the difference between the grade and the next multiple of 5 is less than 3, 
     round grade up to the next multiple of 5. If the value of grade is less than 38, 
     no rounding occurs as the result will still be a failing grade.
     */
    static int[] gradingStudents(int[] grades) {
        int [] roundedGrades = new int [grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 35) {
                roundedGrades [i] = grades[i];
            }else if (nearestMultipleFive(grades[i]) - grades[i] < 2.5) {
                roundedGrades[i] = nearestMultipleFive(grades[i]);
            } else {
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }


    static int nearestMultipleFive(int grade) {
        if (grade % 5 == 0) {
            return grade;
        } else if (grade % 5 < 2) {
            return grade - (grade % 5);
        } else {
            return grade + (5 - (grade % 5));
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
