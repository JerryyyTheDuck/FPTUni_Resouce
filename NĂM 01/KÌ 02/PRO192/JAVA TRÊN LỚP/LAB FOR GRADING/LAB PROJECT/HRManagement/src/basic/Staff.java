package basic;

import mylib.Validation;

public class Staff {

    private int id;
    private String name;
    private String gender;
    private int basicSalary;
    //cai dat quan he 1 staff lam nhieu task
    private Task[] todolist;
    private int[] workinghour;
    private int noOfTasks;
    final int MAX = 100;

    public Staff() {
        id = 0;
        name = "";
        gender = "";
        basicSalary = 0;
        todolist = new Task[100];
        noOfTasks = 0;
        workinghour = new int[MAX];
    }

    public Staff(int id, String name, String gender, int basicSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        todolist = new Task[100];
        workinghour = new int[MAX];
        noOfTasks = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void inputStaff() {
        try {
            id = (int) Validation.inputNumber("input id:", 1, 100);
            name = Validation.inputString("input name:", "^[A-Za-z]+$");
            gender = Validation.inputString("input gender(F/M):", "^[FM]$");
            basicSalary = (int) Validation.inputNumber("input basic salary:", 1, 1000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void outputStaff() {
        System.out.print(id + "-" + name + "-" + gender + "-" + basicSalary);
    }

    //ham nay de them 1 task vao todo list
    // input t la task, hour la so gio staff lam
    public boolean addTask(Task t,int hour) {
        if (t != null && noOfTasks < 100) {
            todolist[noOfTasks] = t;
            workinghour[noOfTasks] = hour;
            noOfTasks++;
            t.addStaff(this);//quan trong 
            return true;
        }
        return false;
    }

    //ham nay de xuat to do list ra man hinh
    public void displayToDoList() {
        if (noOfTasks > 0) {

            System.out.println("DS cong viec phai lam:");
            for (Task task : todolist) {
                task.output();
                System.out.println("Working hour: "+ workinghour);
            }
        } else {
            System.out.println("chua co task nao dc assign");
        }
    }
}
