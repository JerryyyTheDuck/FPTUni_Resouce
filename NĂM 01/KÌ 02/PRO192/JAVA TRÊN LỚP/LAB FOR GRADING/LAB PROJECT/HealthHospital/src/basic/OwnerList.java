/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author USER
 */
public class OwnerList {

    //quan li owner
    private int count;
    private Owner[] list;
    private final int MAX = 100;

    public OwnerList() {
        count = 0;
        list = new Owner[MAX];
    }
    public OwnerList(int count) {
        this.count = count;
        list = new Owner[MAX];

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean addOwnerInList(Owner cus){
        if(count < MAX){
            list[count] = cus;
            count ++;
            return true;
        }
        return false;
    }
    public Owner findOwnerInList(int id){
        if(count >0){
            for(int i = 0; i< count; i++){
                if(list[i].getId() == id)
                    return list[i];
            }
        }
        return null;
    }
    public void displayAllOwnerInList(){
        if(count > 0){
            for(int i = 0; i< count ;i++){
                list[i].ouputOwnerInfo();
            }
        }else{
            System.out.println("No data");
        }
    }
}
