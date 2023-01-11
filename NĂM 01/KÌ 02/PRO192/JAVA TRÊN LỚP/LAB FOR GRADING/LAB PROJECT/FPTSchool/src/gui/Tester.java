package gui;

import basic.Campus;
import basic.Course;
import basic.CourseList;
import basic.Student;
import java.util.Scanner;

/**
 *
 * @author Jack
 */
public class Tester {

    public static void main(String[] args) {
        int choice;
        String yesNo;
        CourseList courseLists = new CourseList();
        Campus campus = null;
        Student studentLists = new Student();

        do {
            System.out.println("\t MENU \t");
            System.out.println("1. tao campus");
            System.out.println("2. tao thong tin sinh vien");
            System.out.println("3. tao mon hoc");
            System.out.println("4. them mon hoc cho sinh vien");
            System.out.println("5. hien thi thong tin sinh vien");
            System.out.print("nhap lua chon: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    if (campus == null) {
                        campus = new Campus();
                        campus.inputCampusInfo();
                        System.out.println("Done");
                        System.out.println("================");
                        System.out.println("Campus Information: ");
                        campus.outputCampusInfo();
                        System.out.println("================");
                    } else {
                        System.out.println("Already have data about campus");
                    }
                    break;
                case 2:
                    Student student = null;
                    if (campus != null) {
                        System.out.println("================");
                        System.out.println("\tWelcome to " + campus.getName() + " campus\t");
                        System.out.println("================");
                        do {
                            student = new Student();
                            System.out.println("Student Information");
                            student.inputStudentInfo();
                            campus.addStudentInCampus(student);
                            System.out.println("Done");
                            while (true) {
                                try {
                                    System.out.print("Do you want to input more? [Y/N]: ");
                                    yesNo = s.nextLine();
                                    if (!yesNo.matches("^[Y/N]$")) {
                                        throw new Exception();
                                    }
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Only Y or N");
                                }
                            }
                        } while (yesNo.contains("Y"));

                        System.out.println("================");
                        System.out.println("Student information");
                        campus.displayStudentInSchool();
                    } else {
                        System.out.println("No data about campus, please create campus first");
                    }
                    break;
                case 3:
                    Course courseCase3 = null;
                    do {
                        courseCase3 = new Course();
                        System.out.println("Course Information");
                        courseCase3.inputCourseInfo();
                        courseLists.addCourseToList(courseCase3);
                        System.out.println("Done");

                        while (true) {
                            try {
                                System.out.print("Do you want to input more courses? [Y/N]: ");
                                yesNo = s.nextLine();
                                if (!yesNo.matches("^[Y/N]$")) {
                                    throw new Exception();
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("Only Y or N");
                            }
                        }
                    } while (yesNo.contains("Y"));

                    System.out.println("================");
                    System.out.println("All Courese information");
                    courseLists.displayCourseInList();
                    break;
                case 4:
                    Course courseCase4 = new Course();
                    Student studentCase4 = new Student();
                    int selection;
                    System.out.println("\t Course List \t");
                    courseLists.displayCourseInList();
                    System.out.print("Please choose course: ");
                    selection = s.nextInt();
                    if (courseLists.findCourseCodeInList(selection) != null) {
                        courseCase4 = courseLists.findCourseCodeInList(selection);
                        campus.displayStudentInSchool();
                        System.out.print("Please enter ID of Student to add course: ");
                        int selectStudent = s.nextInt();
                        if (campus.findIdStudnetInCampus(selectStudent) != null) {
                            studentCase4 = campus.findIdStudnetInCampus(selectStudent);
                            studentCase4.addCourseForStudent(courseCase4);
                            System.out.println("Done");
                            studentCase4.displayCourseOfStudent();
                        } else {
                            System.out.println("Invalid Student id to add");
                        }
                    } else {
                        System.out.println("Invalid course to add");
                    }
                    break;
                case 5:
                    Student studentCase5 = new Student();
                    System.out.println("\tWelcome to " + campus.getName() + " campus\t");
                    campus.displayStudentInSchool();
                    System.out.print("Please choose student to print out: ");
                    int selection1 = s.nextInt();
                    if(campus.findIdStudnetInCampus(selection1) != null){
                        studentCase5 = campus.findIdStudnetInCampus(selection1);
                        studentCase5.displayCourseOfStudent();
                    }else{
                        System.out.println("Invalid student to print out");
                    }
                    break;
            }
        } while (choice <= 5);
    }

}
