/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author green
 */
public class FPTUniversity extends University implements Role {

    String address;


    public FPTUniversity(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void creatWorker() {
        System.out.println("providing human resources");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

}
