/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author green
 */
public class Dealer implements Comparable<Dealer> {
    private String id;
    private String name;    
    private String address;
    private String phone;
    private boolean continuing;
    public Dealer(){
        id = "";
        name = "";
        address = "";
        phone = "";
        continuing = true;
    }
    public Dealer(String id, String name, String address, String phone, boolean continuing) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.continuing = continuing;
    } 

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isContinuing() {
        return continuing;
    }
    public void setContinuing(boolean continuing) {
        this.continuing = continuing;
    }

    @Override
    public int compareTo(Dealer o) {
        throw new UnsupportedOperationException("Not suppor ted yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
