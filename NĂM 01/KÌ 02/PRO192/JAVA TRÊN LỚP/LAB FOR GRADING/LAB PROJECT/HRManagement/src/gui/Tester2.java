/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basic.Manager;
import basic.Staff;
import basic.Task;
import basic.TaskList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tester2 {

    public static void main(String[] args) {
        int c = 0;
        Manager manager = new Manager();
        TaskList tasklist = new TaskList();//luu task cua cty
        do {
            System.out.println("1. nhap thong tin a manager");
            System.out.println("2. them staff cho manager");
            System.out.println("3. xuat ds staff cua manager");
            System.out.println("4. them 1 task vao task list");
            System.out.println("5. xuat task list");
            System.out.println("6. assign task cho staff");
            System.out.println("nhap 1 so:");
            Scanner s = new Scanner(System.in);
            c = s.nextInt();
            switch (c) {
                case 1:
                    if (manager != null) {
                        manager.inputStaff();
                    } else {
                        System.out.println("chua co manager");
                    }
                    break;
                case 2:
                    Staff staff = new Staff();
                    staff.inputStaff();
                    if (manager != null) {
                        manager.addStaff(staff);
                        System.out.println("added");
                    } else {
                        System.out.println("chua co manager");
                    }
                    break;
                case 3:
                    if (manager != null) {
                        manager.displayStaffs();
                    }
                    break;
                case 4:
                    Task t = new Task();
                    t.input();
                    if (tasklist.addTask(t)) {
                        System.out.println("added");
                    } else {
                        System.out.println("not add");
                    }
                    break;
                case 5:
                    tasklist.displayAll();
                    break;
                case 6:
                    //xuat ds nhan vien, cac task dang co
                    manager.displayStaffs();
                    tasklist.displayAll();
                    System.out.println("user nhap stask id can assign:");
                    int taskid = s.nextInt();
                    System.out.println("use nhap staff id can assign:");
                    int staffid = s.nextInt();
                    Task assign_task = tasklist.findTask(taskid);
                    Staff assign_staff = manager.findStaff(staffid);
                    if (assign_task != null && assign_staff != null) {
                        int hour;
                        System.out.println("user nhap so gio du an");
                        hour = s.nextInt();
                        assign_staff.addTask(assign_task, hour);
                        System.out.println("assigned");
                    } else {
                        System.out.println("not found");
                    }
                    break;
            }
        } while (c <= 6);
    }
}
