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
public class Course {

    private int code;
    private String name;
    private int credits;
    private Student[] students;
    private final int MAX = 100;
    private int noStudent;

    public Course() {
        code = 0;
        name = "";
        credits = 0;
        noStudent = 0;
        students = new Student[MAX];
    }

    public Course(int code, String name, int credits, int noStudent) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.noStudent = noStudent;
        students = new Student[MAX];

    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void inputCourseInfo() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input Course's id: ");
                code = Integer.parseInt(s.nextLine());
                if (code <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid code");
            }
        }

        while (true) {
            try {
                System.out.print("Input Course's name: ");
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
                System.out.print("Input Course's credit: ");
                credits = s.nextInt();
                if (credits <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid credit");
            }
        }

    }

    public void outputCourseInfo() {
        System.out.println(code + " - " + name + " - " + credits);
    }

    public boolean addStudentInCourse(Student student) {
        if (noStudent < MAX) {
            students[noStudent] = student;
            noStudent++;
            return true;
        }
        return false;
    }

    public Student findIdStudnetInCourse(int id) {
        if (noStudent > 0) {
            for (int i = 0; i < noStudent; i++) {
                if (students[i].getId() == id) {
                    return students[i];
                }
            }
        }
        return null;
    }

    public void displayCourseOfStudent() {
        if (noStudent > 0) {
            for (int i = 0; i < noStudent; i++) {
                students[i].outputStudentInfo();
            }
        }else{
            System.out.println("no data");
        }
    }
}
