package basic;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jack
 */
public class Student {

    private int id;
    private String name;
    private String address;
    private String gender;
    private int noCourse;
    private Course[] courses;
    private final int MAX = 100;

    public Student() {
        id = 0;
        name = "";
        address = "";
        gender = "";
        noCourse = 0;
        courses = new Course[MAX];
    }

    public Student(int id, String name, String address, String gender, int noCourse) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.noCourse = noCourse;
        courses = new Course[MAX];

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void inputStudentInfo() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input Student's id: ");
                id = Integer.parseInt(s.nextLine());
                if (id <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }

        while (true) {
            try {
                System.out.print("Input Student's name: ");
                name = s.nextLine();
                if (!name.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Name");
            }
        }

        while (true) {
            try {
                System.out.print("Input student's gender(F/M): ");
                gender = s.nextLine();
                if (!gender.matches("^[F/M]$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("You must follow format(dd/mm/yyyy)");
            }
        }
        while (true) {
            try {
                System.out.print("Input Student's address: ");
                address = s.nextLine();
                if (!address.matches("^(\\d+) ?([A-Za-z](?= ))? (.*?) ([^ ]+?) ?((?<= )APT)? ?((?<= )\\d*)?$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid address");
            }
        }
    }

    public void outputStudentInfo() {
        System.out.println(id + " - " + name + " - " + address + "  - " + gender);
    }

    public boolean addCourseForStudent(Course course) {
        if (noCourse < MAX) {
            courses[noCourse] = course;
            noCourse++;
            return true;
        }
        return false;
    }

    public Course findIdCourseOfStudent(int code) {
        if (noCourse > 0) {
            for (int i = 0; i < noCourse; i++) {
                if (courses[i].getCode() == code) {
                    return courses[i];
                }
            }
        }
        return null;
    }

    public void displayCourseOfStudent() {
        System.out.println("Student Information: ");
        outputStudentInfo();
        System.out.println("Student's enrolled course");
        if (noCourse > 0) {
            for (int i = 0; i < noCourse; i++) {
                courses[i].outputCourseInfo();
            }
        }else{
            System.out.println("No current enrolled course for this student");
        }

    }
}
