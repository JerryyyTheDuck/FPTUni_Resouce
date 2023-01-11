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
public class Campus {

    private int code;
    private String name;
    private String address;
    private Student[] students;
    private int noStudent;
    private final int MAX = 100;

    public Campus() {
        code = 0;
        name = "";
        address = "";
        noStudent = 0;
        students = new Student[MAX];
    }

    public Campus(int code, String name, String address, int noStudent) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.noStudent = noStudent;
        students = new Student[MAX];

    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputCampusInfo() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input Campus's code: ");
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
                System.out.print("Input Campus's name: ");
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
                System.out.print("Input school's address: ");
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

    public void outputCampusInfo() {
        System.out.println(code + " - " + name + " - " + address);
    }

    public boolean addStudentInCampus(Student student) {
        if (noStudent < MAX) {
            students[noStudent] = student;
            noStudent++;
            return true;
        }
        return false;
    }

    public Student findIdStudnetInCampus(int id) {
        if (noStudent > 0) {
            for (int i = 0; i < noStudent; i++) {
                if (students[i].getId() == id) {
                    return students[i];
                }
            }
        }
        return null;
    }

    public void displayStudentInSchool(){
        if (noStudent > 0) {
            for (int i = 0; i < noStudent; i++) {
                students[i].outputStudentInfo();
            }
        }else{
            System.out.println("no Data");
        }

    }
}
