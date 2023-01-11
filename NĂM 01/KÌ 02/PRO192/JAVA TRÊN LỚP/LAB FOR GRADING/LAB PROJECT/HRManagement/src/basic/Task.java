/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task {

    private int id;
    private String title;
    private String begin;
    private String end;
    private int totalHours;
    //cai dat quan he 1 task duoc lam boi nhieu staff
    private Staff[] stafflist;
    private int noOfStaff;

    public Task() {
        id = 0;
        title = "";
        begin = "";
        end = "";
        totalHours = 0;
        stafflist = new Staff[100];
        noOfStaff = 0;
    }

    public Task(int id, String title, String begin, String end, int totalHours) {
        this.id = id;
        this.title = title;
        this.begin = begin;
        this.end = end;
        this.totalHours = totalHours;
        this.stafflist = new Staff[100];
        this.noOfStaff = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBegin() {
        return begin;
    }

    public String getEnd() {
        return end;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input task id: ");
                id = Integer.parseInt(s.nextLine());
                if (id <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("id must be > 0 and all are numbers");
            }
        }
        while (true) {
            try {
                System.out.println("Input title: ");
                title = s.nextLine();
                if (!title.matches("^[a-zA-Z]*$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid title");
            }
        }

        while (true) {
            try {
                System.out.println("Input begin date (dd/mm/yyyy): ");
                begin = s.nextLine();
                if (!begin.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("You must follow format(dd/mm/yyyy)");
            }
        }
        while (true) {
            try {
                System.out.println("Input end date (dd/mm/yyyy): ");
                end = s.nextLine();
                if (!end.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("You must follow format(dd/mm/yyyy)");
            }
        }

    }

    public void output() {
        System.out.println("ID: "+ id);
        System.out.println("Title: "+ title);
        System.out.println("Begin date: "+ begin);
        System.out.println("End date: "+ end);
    }

//ham nay de them 1 staff vao stafflist
    public boolean addStaff(Staff staff) {
        if (staff != null && noOfStaff < 100) {
            stafflist[noOfStaff] = staff;
            noOfStaff++;
            return true;
        }
        return false;
    }

    public void displayAllStaffs() {
        if (noOfStaff > 0) {
            System.out.println("DS NV thuc hien du an:");
            for (Staff staff : stafflist) {
                staff.outputStaff();
            }
        } else {
            System.out.println("chua co nv nao thuc hien du an nay");
        }
    }
}
