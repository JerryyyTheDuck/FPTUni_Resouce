package gui;

import basic.Owner;
import basic.OwnerList;
import basic.Pet;
import basic.ServiceList;
import basic.Services;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int choice;
        int selectId;
        OwnerList ownerlist = new OwnerList();
        ServiceList servicelist = new ServiceList();

        do {
            System.out.println("1. tao service");
            System.out.println("2. tao thong tin khach hang va pet cua khach hang");
            System.out.println("3. them pet cho khach hang");
            System.out.println("4. chon dich vu va su dung");
            System.out.println("5. xuat phieu thanh toan");
            System.out.print("nhap lua chon: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    Services service = new Services();
                    service.inputServiceInfo();
                    servicelist.addServiceInList(service);
                    System.out.println("Done");
                    System.out.println("============");
                    break;
                case 2:
                    Pet pet = new Pet();
                    Owner cus = new Owner();
                    System.out.println("Input pet information: ");
                    pet.inputPetInfo();
                    System.out.println("Input Owner information");
                    cus.inputOwnerInfo();

                    cus.addPetsForOwner(pet);
                    ownerlist.addOwnerInList(cus);
                    
                    System.out.println("");
                    System.out.println("Pet information");
                    System.out.println("==============");
                    cus.displayPetofOwner();
                    System.out.println("");
                    System.out.println("Owner information");
                    System.out.println("==============");
                    cus.ouputOwnerInfo();
//                  ownerlist.displayAllOwnerInList();

                    System.out.println("Done");
                    break;
                case 3:
                    Pet petAdd = new Pet();
                    Owner currentCus = new Owner();
                    ownerlist.displayAllOwnerInList();
                    System.out.print("Input user ID for add in pet: ");
                    int id = s.nextInt();
                    if (ownerlist.findOwnerInList(id) != null) {
                        currentCus = ownerlist.findOwnerInList(id);
                        System.out.println("Input pet information: ");
                        petAdd.inputPetInfo();
                        currentCus.addPetsForOwner(petAdd);
                        System.out.println("Done");
                        System.out.println("");
                    } else {
                        System.out.println("No user match with this id");
                    }
                    break;
                case 4:
                    Pet pet1 = new Pet();
                    Services serviceForPet = new Services();
                    Owner cusCase4 = new Owner();
                    System.out.println("id \t service \t price" );
                    servicelist.displayAllServiceInList();
                    System.out.print("Select service: ");
                    selectId = s.nextInt();
                    if (servicelist.findServiceInList(selectId) != null) {
                        serviceForPet = servicelist.findServiceInList(selectId);
                        ownerlist.displayAllOwnerInList();                       
                        System.out.print("Which cus do you want to add service (input id) ");
                        int id1 = s.nextInt();
                        if (ownerlist.findOwnerInList(id1) != null) {
                            cusCase4 = ownerlist.findOwnerInList(id1);
                            cusCase4.displayPetofOwner();
                            System.out.print("Which pet do you want to add service (input id) ");
                            int id2 = s.nextInt();
                            if (cusCase4.findPetOfOwner(id2) != null) {
                                pet1 = cusCase4.findPetOfOwner(id2);
                                pet1.addServicesForPet(serviceForPet);
                            } else {
                                System.out.println("No pet match with this id");
                            }
                        } else {
                            System.out.println("No user match with this id");
                        }
                    } else {
                        System.out.println("This service is not available right now");
                    }
                    break;
                case 5:
                    Owner case5 = new Owner();
                    Pet petCase5 = new Pet();
                    if (ownerlist != null) {
                        ownerlist.displayAllOwnerInList();
                        System.out.println("Which cus do you want to print service (input id)");
                        selectId = s.nextInt();
                        if (ownerlist.findOwnerInList(selectId) != null) {
                            System.out.println("Welcome to FPT hospital");
                            case5 = ownerlist.findOwnerInList(selectId);
                            case5.ouputOwnerInfo();
                            case5.displayPetofOwner();

                        }
                    } else {
                        System.out.println("no data to put out");
                    }
                    break;
            }
        } while (choice <= 5);
    }
}
