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
public class Pet {

    private int id;
    private String name;
    private String birthday;
    private String gender;
    private int noService;
    private Services[] usedServices;
    private final int MAX = 100;

    public Pet() {
        id = 0;
        name = "";
        birthday = "";
        gender = "";
        noService = 0;
        usedServices = new Services[MAX];
    }
    public Pet(int id, String name, String birthday, String gender, int noService) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.noService = noService;
        usedServices = new Services[MAX];

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getGender() {
        return gender;
    }
    public int getNoService() {
        return noService;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setNoService(int noService) {
        this.noService = noService;
    }

    public void inputPetInfo(){
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input Pet id: ");
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
                System.out.print("Input Pet name: ");
                name = s.nextLine();
                if (!name.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Name");
            }
        }
        while (true) {
            try {
                System.out.print("Input pet's birthday (dd/mm/yyyy): ");
                birthday = s.nextLine();
                if (!birthday.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("You must follow format(dd/mm/yyyy)");
            }
        }
        
        while (true) {
            try {
                System.out.print("Input pet's gender(F/M): ");
                gender = s.nextLine();
                if (!gender.matches("^[F/M]$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("You must follow format(dd/mm/yyyy)");
            }
        }
        
        
    }
    public void outputPetInfo(){
        System.out.println(id + " - " + name + " - " + birthday + " - " + gender);
    }
    
    public boolean addServicesForPet(Services service){
        if(noService<MAX){
            usedServices[noService] = service;
            noService++;
            return true;
        }
        return false;
    }
    public Services findServicesOfPet(int id){
        if(noService > 0){
            for(int i = 0; i< noService; i++){
                if(usedServices[i].getId() == id){
                    return usedServices[i];
                }
            }
        }
        return null;
    }
    public void displayServiceUsedByPet(){
        if(noService > 0){
            for(int i = 0; i< noService; i++){
                usedServices[i].outputServiceInfo();
            }
        }else{
            System.out.println("No current service for this pet");
        }
    }
    
}
