/**
 * Name of Student/Programmer: JASMIN, RAMON EMMIEL P.
 * CLASS CODE & Schedule: 9301 9:00 - 10:30
 * Date: January 31, 2023
 * Student Records Keeping Using Parallel Arrays
 * <p>
 * An ID number, a name, a course, a year level and others are
 * attributed to a student. Hence, eight arrays are
 * used: An array that stores ID numbers, an array that
 * stores names, an array that stores courses, an array
 * that stores year levels, etc. The eight arrays are treated
 * as parallel arrays such that the first elements of the
 * eight arrays are actual attributes (ID number, name, course,
 * year level, etc. ) of one student, the second elements are
 * actual attributes of another student, and so on.
 * <p>
 *
 * SAMPLE RUN:
 *
 * How many student records will be created? 3
 * STUDENT 1 ID: 2230748
 * STUDENT 1 NAME: Benny
 * STUDENT 1 COURSE: BSCS
 * STUDENT 1 YEAR LEVEL: 1
 * STUDENT 1 PRELIM GRADE: 90
 * STUDENT 1 MIDTERM GRADE: 91
 * STUDENT 1 TENTATIVE FINAL GRADE: 92
 * STUDENT 1 FINAL GRADE: 93
 * STUDENT 2 ID: 2230747
 * STUDENT 2 NAME: Cindy
 * STUDENT 2 COURSE: BSCS
 * STUDENT 2 YEAR LEVEL: 1
 * STUDENT 2 PRELIM GRADE: 93
 * STUDENT 2 MIDTERM GRADE: 92
 * STUDENT 2 TENTATIVE FINAL GRADE: 91
 * STUDENT 2 FINAL GRADE: 90
 * STUDENT 3 ID: 2230746
 * STUDENT 3 NAME: Andrew
 * STUDENT 3 COURSE: BSCS
 * STUDENT 3 YEAR LEVEL: 1
 * STUDENT 3 PRELIM GRADE: 90
 * STUDENT 3 MIDTERM GRADE: 92
 * STUDENT 3 TENTATIVE FINAL GRADE: 94
 * STUDENT 3 FINAL GRADE: 96
 *
 * Original Order Data
 *      ID NO      NAME    COURSE        YL        PG        MG       TFG        FG
 *   --------  --------  --------   -------  --------  --------  --------  --------
 *    2230748     Benny      BSCS         1        90        91        92        93
 *    2230747     Cindy      BSCS         1        93        92        91        90
 *    2230746    Andrew      BSCS         1        90        92        94        96
 *   --------  --------  --------   -------  --------  --------  --------  --------
 *
 * Sorted Data
 *      ID NO      NAME    COURSE        YL        PG        MG       TFG        FG
 *   --------  --------  --------   -------  --------  --------  --------  --------
 *    2230746    Andrew      BSCS         1        90        92        94        96
 *    2230748     Benny      BSCS         1        90        91        92        90
 *    2230747     Cindy      BSCS         1        93        92        91        93
 *   --------  --------  --------   -------  --------  --------  --------  --------
 * <p>
 */

package prelim;

import java.lang.*;
import java.util.Scanner;

public class StudentRecordsViaParallelArrays {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String[] id; // Array that will store ID numbers
        String[] names; // Array that will store names
        String[] course;// Array that will store courses

        int[] yearLevel; // array that will store year levels
        int count; // variable that will store the number of students

        byte[] pGrade; // to store prelim grade
        byte[] mGrade; // to store midterm grade
        byte[] tFGrade; // to store tentative Final Grade
        byte[] fGrade; // to store final grade

        // Read the number of students to be recorded from the keyboard
        System.out.print("How many student records will be created? ");
        count = Integer.parseInt(keyboard.nextLine());

        id = new String[count];
        names = new String[count];
        course = new String[count];

        yearLevel = new int[count];

        pGrade = new byte[count];
        mGrade = new byte[count];
        tFGrade = new byte[count];
        fGrade = new byte[count];


        populateArrays(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);


        System.out.println("Original Order Data");
        showData(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);




        // Show the students in sorted order
        System.out.println("Sorted Data");
        sortDataBasedOnNames(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);
        showData(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);
    }

    /**
     * Put elements into arrays (parallel arrays) for ID numbers, names,
     course, year levels, prelim grade,
     * midterm grade, tentative final grade, and final grade
     **/
    public static void populateArrays(String[] id, String[] n, String[]
            c, int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {

        int count = id.length;

        for (int i = 0; i < count; i++){

            System.out.print("STUDENT " + (i + 1) + " ID: ");
            id[i] = keyboard.nextLine();

            System.out.print("STUDENT " + (i + 1) + " NAME: ");
            n[i] = keyboard.nextLine();

            System.out.print("STUDENT " + (i + 1) + " COURSE: ");
            c[i] = keyboard.nextLine();

            System.out.print("STUDENT " + (i+1) + " YEAR LEVEL: ");
            y[i] = Integer.parseInt(keyboard.nextLine());

            System.out.print("STUDENT " + (i+1) + " PRELIM GRADE: ");
            p[i] = Byte.parseByte(keyboard.nextLine());

            System.out.print("STUDENT " + (i+1) + " MIDTERM GRADE: ");
            m[i] = Byte.parseByte(keyboard.nextLine());

            System.out.print("STUDENT " + (i+1) + " TENTATIVE FINAL GRADE: ");
            t[i] = Byte.parseByte(keyboard.nextLine());

            System.out.print("STUDENT " + (i+1) + " FINAL GRADE: ");
            f[i] = Byte.parseByte(keyboard.nextLine());
        }

        return;
    }

    /**
     * Show the elements of the arrays on the screen.
     **/
    public static void showData(String[] id, String[] n, String[] c,
                                int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {

        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%10s\n", "ID NO", "NAME", "COURSE", "YL", "PG", "MG", "TFG", "FG");
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%10s\n", "--------", "--------", "--------",
                "-------", "--------", "--------", "--------", "--------");

        for (int i = 0; i < id.length; i++) {
            System.out.printf("%10s%10s%10s%10d%10d%10d%10d%10d\n", id[i], n[i],
                    c[i], y[i], p[i], m[i], t[i], f[i]);
        }

        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%10s\n", "--------", "--------", "--------",
                "-------", "--------", "--------", "--------", "--------");

    } // end of showData method

    /**
     * Sort the elements of the eight arrays in parallel (i.e. When
     * there is a need to swap elements of the array n,
     * the corresponding elements in other arrays should also
     * be swapped.) such that the elements of array n
     * are lexicographically arranged.
     * BUBBLE SORT ALGORITHM WILL BE IMPLEMENTED
     */
    public static void sortDataBasedOnNames(String[] id, String[] n,
                                            String[] c, int[] yLevel, byte[] p, byte[] m, byte[] t, byte[] f) {
        for (int i = 0; i < id.length - 1; i++){
            for (int j = 0; j < id.length - 1; j++){
                if (n[j].compareTo(n[j+1]) >= 1){

                    String tempName = n[j];
                    n[j] = n[j+1];
                    n[j+1] = tempName;

                    String tempID = id[j];
                    id[j] = id[j+1];
                    id[j+1] = tempID;

                    String tempCourse = c[j];
                    c[j] = c[j+1];
                    c[j+1] = tempCourse;

                    int tempYl = yLevel[j];
                    yLevel[j] = yLevel[j+1];
                    yLevel[j+1] = tempYl;

                    byte tempP = p[j];
                    p[j] = p[j+1];
                    p[j+1] = tempP;

                    byte tempM = m[j];
                    m[j] = m[j+1];
                    m[j+1] = tempM;

                    byte tempTFG = t[j];
                    t[j] = t[j+1];
                    t[j+1] = tempTFG;

                    byte tempF = f[j];
                    f[j] = f[j+1];
                    f[j+1] = tempP;
                }
            }
        }

    } // end of sortBasedOnNames method

}
