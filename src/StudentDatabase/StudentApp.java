package StudentDatabase;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of the students to enroll : ");
        int numofstu = scn.nextInt();
        Student[] Student = new Student[numofstu];
        for(int i=0;i<numofstu;i++){
            Student[i]  = new Student();
            Student[i].enroll();
            Student[i].payment(700);
            System.out.println();
            System.out.println("Student information ---> ");
            System.out.println(Student[i].toString());
        }

    }
}
