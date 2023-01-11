/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author green
 */
public class BeeColony extends Colony implements Role {

    String type;


    public BeeColony(String type, String place, int size) {
        super(place, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony’s type is " + type + ", size is about" + size + ", and the place is" + place;
    }

    @Override
    public void creatWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

}
