/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Services {

    private int id;
    private String name;
    private int price;
    private int noPet;
    private final int MAX = 100;
    private Pet[] petlist;

    public Services() {
        id = 0;
        name = "";
        price = 0;
        noPet = 0;
        petlist = new Pet[MAX];
    }
    public Services(int id, String name, int price, int noPet) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.noPet = noPet;
        petlist = new Pet[MAX];
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getNoPet() {
        return noPet;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setNoPet(int noPet) {
        this.noPet = noPet;
    }
    
    public void inputServiceInfo(){
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input id: ");
                id = Integer.parseInt(s.nextLine());
                if (id <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }
        
        while (true) {
            try {
                System.out.print("Input name: ");
                name = s.nextLine();
                if (!name.matches("^([^\\p{N}\\p{S}\\p{C}\\\\\\/]{2,20})$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Name");
            }
        }
        while (true) {
            try {
                System.out.print("Input price: ");
                price = Integer.parseInt(s.nextLine());
                if (price <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid price");
            }
        }
        

    }
    public void outputServiceInfo(){
        System.out.println(id + "\t" + name + "\t" + price );
    }

    public boolean addPetsForService(Pet pet){
        if(noPet < MAX){
            petlist[noPet] = pet;
            noPet++;
            return true;
        }
        return false;
    }
    public Pet findPetsUseService(){
        if(noPet > 0){
            for(int i =0; i < noPet; i++){
                if(petlist[i].getId() == id){
                    return petlist[i];
                }
            }
        }
        return null;
    }  
    public void displayPetUseService(){
        if(noPet>0){
            for(int i = 0; i<noPet; i++){
                petlist[i].outputPetInfo();
            }
        }else{
            System.out.println("No data");
        }
    }
    
    
}
