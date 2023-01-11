package data;

import Library.SLL;
import Tool.MyTool;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class train extends SLL<train> implements Comparable<train> {

    private String tcode;
    private String train_name;
    private int seat;
    private int booked;
    private double depart_time;
    private String depart_place;
    private int available_seat;

    public train() {
        tcode = "";
        train_name = "";
        seat = 0;
        booked = 0;
        depart_time = 0;
        depart_place = "";
        available_seat = 0;
    }
    public train(String tcode, String train_name, int seat, int booked, double depart_time, String depart_place, int available_seat) {
        this.tcode = tcode;
        this.train_name = train_name;
        this.seat = seat;
        this.booked = booked;
        this.depart_time = depart_time;
        this.depart_place = depart_place;
        this.available_seat = available_seat;
    }

    public String getTcode() {
        return tcode;
    }
    public int getAvailable_seat() {
        return available_seat;
    }
    public void setAvailable_seat(int available_seat) {
        this.available_seat = available_seat;
    }


    public void inputTrain() {
        tcode = MyTool.inputString("Input train code: ", "^[A-Za-z]{1}[0-9]{2}$", "Invalid train code");
        train_name = MyTool.inputString("Input train name: ", "^[a-zA-Z]{3}$", "Invald train name");
        tcode = Character.toString(tcode.charAt(0)).toUpperCase() + tcode.substring(1);
        train_name = Character.toString(train_name.charAt(0)).toUpperCase() + train_name.substring(1);
        seat = MyTool.inputIntNumber("Input number of seat: ", "Invalid seat number");
        while (true) {
            try {
                booked = MyTool.inputIntNumber("Input booked: ", "Invalid booked number");
                if (booked > seat) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Booked number must be < seat");
            }
        }
        depart_time = MyTool.inputDoubleNumber("Input depart time: ", "Invalid depart_time");
        depart_place = MyTool.inputString("Input depart place: ", "^[a-zA-Z]{2}$", "Invalid depart place").toUpperCase();
        available_seat = seat - booked;
    }
    @Override
    public int compareTo(train o) {
        return this.tcode.compareTo(o.tcode);
    }

    @Override
    public String toString() {
        return tcode + " | " + train_name + " | " + seat + " | " + booked + " | " + depart_time + " | " + depart_place + " | " + available_seat;
    }

}
