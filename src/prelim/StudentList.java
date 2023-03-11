/**
 * Name of Student/Programmer: JASMIN, Ramon Emmiel P.
 * CLASS CODE & Schedule: 9301 9:00 - 10:30
 * Date: February 1, 2023
 * Student Records Keeping Using Reference Class
 * */

package prelim;

import java.lang.*;
import java.util.Scanner;

public class StudentList {

    final static Scanner userInput =  new Scanner(System.in);

    public static void main(String[] args) {

        Student[] list;
        int count;

        System.out.print("How many students will be listed? ");
        count = Integer.parseInt(userInput.next());

        list = new Student[count];

        System.out.println();
        System.out.println("Proceed to enter student information");
        userInput.nextLine();
        System.out.println();

        for (int i = 0; i < list.length; i++){
            System.out.println("STUDENT " + (i + 1));
            list[i] = readStudent();
        }

        System.out.println();
        System.out.println("UNSORTED RECORD");
        showList(list);

        System.out.println();
        System.out.println("SORTED RECORD");
        sortList(list);
        showList(list);
    }

    public static void sortList(Student[] student){
        int minIndex;

        for (int i = 0; i < student.length - 1; i++){
            minIndex = i;

            for (int j = i + 1; j < student.length; j++){
                if (student[minIndex].getLastName().compareToIgnoreCase(student[j].getLastName()) > 0){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                Student temp = student[i];
                student[i] = student[minIndex];
                student[minIndex] = temp;
            }
        }
    }

    private static Student readStudent(){
        String firstName;
        String midName;
        String lastName;
        String IDNumber;
        String course;
        int age;


        System.out.print("FIRST NAME: ");
        firstName = userInput.nextLine();

        System.out.print("MIDDLE NAME: ");
        midName = userInput.nextLine();

        System.out.print("LAST NAME: ");
        lastName = userInput.nextLine();

        System.out.print("ID NUMBER: ");
        IDNumber = userInput.nextLine();

        System.out.print("COURSE: ");
        course = userInput.nextLine();

        System.out.print("AGE: ");
        age = Integer.parseInt(userInput.nextLine());

        System.out.println();

        Student newStudent = new Student(firstName, midName, lastName, IDNumber, course, age);

        return newStudent;
    }

    public static void showList(Student[] students){
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }
    }
}
