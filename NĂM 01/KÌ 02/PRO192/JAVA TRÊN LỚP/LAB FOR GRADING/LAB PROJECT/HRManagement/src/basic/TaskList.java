/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author user
 */
public class TaskList {

    private Task[] tasklist;
    private int count;
    private final int MAX = 100;

    public TaskList() {
        tasklist = new Task[100];
        count = 0;
    }

    public boolean addTask(Task t) {
        if (count < MAX) {
            tasklist[count] = t;
            count++;
            return true;
        }
        return false;
    }

    public Task findTask(int id) {
        for (int i = 0; i < count; i++) {
            if (tasklist[i].getId() == id) {
                return tasklist[i];
            }
        }

        return null;
    }

    public void displayAll() {
        for(int i = 0; i<count; i++){
            tasklist[i].output();
        }
    }

}
