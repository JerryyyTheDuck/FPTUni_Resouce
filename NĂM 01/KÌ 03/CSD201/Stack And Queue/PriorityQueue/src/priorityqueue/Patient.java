/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityqueue;

/**
 *
 * @author green
 */
public class Patient extends SLL implements Comparable<Patient>{
    private String name;
    private int id; 

    public Patient() {
    }

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Patient o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return id + "," + name;
    }
    
}
