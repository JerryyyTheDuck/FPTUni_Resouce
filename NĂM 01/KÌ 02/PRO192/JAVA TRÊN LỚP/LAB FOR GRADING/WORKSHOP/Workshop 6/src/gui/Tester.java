/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import data.StudentList;
import java.util.Scanner;

/**
 *
 * @author green
 */
public class Tester {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        StudentList studentList = new StudentList();
        do {
            System.out.println("1-Add new student");
            System.out.println("2-Search a student");
            System.out.println("3-Update name and mark");
            System.out.println("4-Remove a student");
            System.out.println("5-List all");
            System.out.println("6-Quit");
            System.out.print("Your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.findStudent();
                    break;
                case 3:
                    studentList.editStudent();
                    break;
                case 4:
                    studentList.removeStudent();
                    break;
                case 5:
                    studentList.displayStudent();
                    break;
                case 6:
                    System.out.println("Have a great day.");
                    break;
            }
        } while (choice < 6);
    }
}
