/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author green
 */
public class University extends Organization {

    String name;

    public University(String name) {
        super();
        this.name = name;
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }

    public void educate() {
        System.out.println("provide education at university standard");
    }

    @Override
    public void communicateByTool() {
        System.out.println("in the university, people communicate by voice");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
}
