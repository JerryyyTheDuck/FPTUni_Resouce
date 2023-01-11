/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import Library.SLL;
import Tool.MyTool;

/**
 *
 * @author green
 */
public class Customer extends SLL implements Comparable<Customer>{
    private String ccode;
    private String name; 
    private String phone;

    public Customer() {
    }

    public Customer(String ccode, String name, String phone) {
        this.ccode = ccode;
        this.name = name;
        this.phone = phone;
    }

    public String getCcode() {
        return ccode;
    }
    public String getName() {
        return name;
    }
    public void inputCustomer(){
        ccode = MyTool.inputString("Input customer ccode: ", "^[A-Za-z]{1}[0-9]{2}$", "Invalid ccode").toUpperCase();
        name = MyTool.inputString("Input name: ", "^[A-Za-z ]+$", "Invalid name");
        name = Character.toString(name.charAt(0)).toUpperCase() + name.substring(1);
        phone = MyTool.inputString("Input phone number: ", "^[0-9]{4}$", "Invalid phone number");
    }
    @Override
    public int compareTo(Customer o) {
        return 0;
    }

    @Override
    public String toString() {
        return ccode + " | " + name+ " | " + phone;
    }
    
}
