/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author green
 */
public class StudentList extends ArrayList<Student> {

    public StudentList() {
        super();
    }

    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (Student student : this) {
            if (student.getCode().equals(code)) {
                return student;
            }
        }
        return null;
    }    
    public void addStudent() {
        Scanner s = new Scanner(System.in);
        int mark = 0;
        String code = "";
        String name = "";
        while (true) {
            try {
                System.out.print("Input id (S + 3 number): ");
                code = s.nextLine();
                if (!code.matches("[sS][\\d]{3}")) {
                    throw new Exception();
                }
                code = code.trim().toUpperCase();
                break;
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }
        System.out.print("Input name: ");
        name = s.nextLine().trim().toUpperCase();
//        do {
//            try {
//                System.out.print("Input name: ");
//                name = s.nextLine();
//                if (!name.matches("^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)")) {
//                    throw new Exception();
//                }
//                break;
//            } catch (Exception e) {
//                System.out.println("Invalid name");
//            }
//        } while (true);

        while(true) {
            try {
                System.out.println("Input mark");
                mark = Integer.parseInt(s.nextLine());
                if (mark < 0 && mark > 10) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid mark");
            }
        };

        this.add(new Student(code, name, mark));
        System.out.println("Added");
    }
    public void removeStudent() {
        String id;
        Scanner s = new Scanner(System.in);
        if (this.isEmpty()) {
            System.out.println("No data for removing student");
        } else {
            while (true) {
                try {
                    System.out.print("Input id to delete (S+3 numbers): ");
                    id = s.nextLine().trim().toUpperCase();
                    if (!id.matches("[Ss][\\d]{3}")) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid id");
                }
            }
            Student student = this.search(id);
            if (student != null) {
                this.remove(student);
                System.out.println("Done");
            } else {
                System.out.println("Dont have this id to remove");
            }
        }
    }
    public void findStudent() {
        String id;
        Scanner s = new Scanner(System.in);
        if (this.isEmpty()) {
            System.out.println("There's nothing to search");
        } else {
            while (true) {
                try {
                    System.out.print("Input id to serch (S + 3 number): ");
                    id = s.nextLine().trim().toUpperCase();
                    if (!id.matches("[Ss][\\d]{3}")) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid id");
                }
            }
            Student student1 = this.search(id);
            if (student1 != null) {
                System.out.println("The student found: " + student1);
            } else {
                System.out.println("Not found");
            }
        }
    }
    public void displayStudent() {
        if (this.isEmpty()) {
            System.out.println("Nothing to print");
        } else {
            for (Student student : this) {
                System.out.println(student);
            }
        }
    }
    public void editStudent() {
        String id;
        String newName;
        int newMark;
        Scanner s = new Scanner(System.in);
        if (this.isEmpty()) {
            System.out.println("No student to edit");
        } else {
            while (true) {
                try {
                    System.out.print("Input id: ");
                    id = s.nextLine();
                    if (!id.matches("[Ss][\\d]{3}")) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid id");
                }
            }
            Student student = this.search(id);
            if (student != null) {
                String oldName = student.getName();
                int oldMark = student.getMark();
                System.out.println("Old name: " + oldName);
                System.out.print("Input new name: ");
                newName = s.nextLine().trim().toUpperCase();
                student.setName(newName);
//                while (true) {
//                    try {
//                        System.out.print("Input new name");
//                        newName = s.nextLine();
//                        if (!newName.matches("^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)")) {
//                            throw new Exception();
//                        }
//                        student.setName(newName);
//
//                        break;
//                    } catch (Exception e) {
//                        System.out.println("Invlid name");
//                    }
//                }
                System.out.println("This is new name: " + newName);
                System.out.println("Old mark: " + oldMark);
                while (true) {                    
                    try {
                        System.out.println("Input new mark");
                        newMark = Integer.parseInt(s.nextLine());
                        if(newMark<0 && newMark >10){
                            throw new Exception();
                        }
                        student.setMark(newMark);
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid mark");
                    }
                }
                System.out.println("this is new mark: "+ newMark);
            }else{
                System.out.println("No student found wit this id");
            }
        }
    }
}
