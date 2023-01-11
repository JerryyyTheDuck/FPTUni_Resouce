package basic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jack
 */
public class CourseList {

    private Course[] courseList;
    private int noCourse;
    private final int MAX = 100;

    public CourseList() {
        noCourse = 0;
        courseList = new Course[MAX];
    }

    public CourseList(int noCourse) {
        this.noCourse = noCourse;
        courseList = new Course[MAX];

    }

    public int getnoCourse() {
        return noCourse;
    }

    public void setCount(int noCourse) {
        this.noCourse = noCourse;
    }

    public boolean addCourseToList(Course course) {
        if (noCourse < MAX) {
            courseList[noCourse] = course;
            noCourse++;
            return true;
        }
        return false;
    }

    public Course findCourseCodeInList(int code) {
        if (noCourse > 0) {
            for (int i = 0; i < noCourse; i++) {
                if (courseList[i].getCode() == code) {
                    return courseList[i];
                }
            }
        }
        return null;
    }

    public void displayCourseInList() {
        if (noCourse > 0) {
            for (int i = 0; i < noCourse; i++) {
                courseList[i].outputCourseInfo();
            }
        } else {
            System.out.println("no data");
        }
    }
}
