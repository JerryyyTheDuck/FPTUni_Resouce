/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author USER
 */
public class ServiceList {

    //1 list chứa nhiều service;
    private Services[] list;
    private int count;
    private final int MAX = 100;

    public ServiceList() {
        count = 0;
        list = new Services[MAX];

    }
    public ServiceList(int count) {
        this.count = count;
        list = new Services[MAX];
    }

    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }

    public boolean addServiceInList(Services service){
        if(count < MAX){
            list[count] = service;
            count ++;
            return true;
        }
        return false;
    }
    public Services findServiceInList(int id){
        if(count >0){
            for(int i = 0; i< count; i++){
                if(list[i].getId() == id)
                    return list[i];
            }
        }
        return null;
    }
    public void displayAllServiceInList(){
        if(count > 0){
            for(int i = 0; i< count ;i++){
                list[i].outputServiceInfo();
            }
        }else{
            System.out.println("No data");
        }
    }
}
