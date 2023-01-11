package gui;

import Library.bookingList;
import Library.customerList;
import Tool.MyTool;
import Library.trainList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        trainList trainList = new trainList();
        customerList csList = new customerList();
        bookingList bList = new bookingList();
        int choice,choice1,choice2,choice3;
        char c = 0;
        do {
            MyTool.Menu();
            choice = MyTool.inputChoice("Your choice: ", "Choice must be a number and  0 < choice < 5",4);
            switch (choice) {
                case 1:
                    do {
                        MyTool.MenuForTrain();
                        choice1 = MyTool.inputChoice("Your choice: ", "Choice must be a number and  0 < choice < 11",10);
                        switch (choice1) {
                            case 1:
                                trainList.printCurrentList();
                                break;
                            case 2:
                                trainList.addTrainToList();
                                break;
                            case 3:
                                trainList.printAllWithBanner();
                                break;
                            case 4:
                                trainList.writeFile();
                                break;
                            case 5:
                                trainList.searchByTCode();
                                break;
                            case 6:
                                trainList.deleteItem();
                                break;
                            case 7:
                                trainList.sortList();
                                break;
                            case 8:
                                trainList.addPos();
                                break;
                            case 9:
                                trainList.deleteBefore();
                                break;
                            default:
                                System.out.println("QUITTING TO MENU.....");
                                break;
                        }
                    } while (choice1 > 0 && choice1 < 10);
                    break;
                case 2:
                    do {
                        MyTool.menuForCus();
                        choice2 = MyTool.inputChoice("Your choice: ", "Choice must be a number and  0 < choice < 8",7);
                        switch (choice2) {
                            case 1:
                                csList.printList();
                                break;
                            case 2:
                                csList.addCusToList();
                                break;
                            case 3:
                                csList.displayAll();
                                break;
                            case 4:
                                csList.saveToFile();
                                break;
                            case 5:
                                csList.searchAndPrint();
                                break;
                            case 6:
                                csList.delete();
                                break;
                            default:
                                System.out.println("QUITTING TO MENU.....");
                                break;
                        }
                    } while (choice2 > 0 && choice2 < 7);
                    break;
                case 3:
                    do {
                        MyTool.menuForBooking();
                        choice3 = MyTool.inputChoice("Your choice: ", "Choice must be a number and  0 < choice < 5",4);
                        switch (choice3) {
                            case 1:
                                bList.inputBook(csList,trainList);
                                break;
                            case 2:
                                bList.displayAll();
                                break;
                            case 3:
                                bList.sort();
                                break;
                            default:
                                System.out.println("QUITTING TO MENU.....");
                                break;
                        }
                    } while (choice3 > 0 && choice3 <4);
                    break;
                default:
                    System.out.println("Have a nice day");
                    break;
            }
        } while (choice > 0 && choice < 4);
    }
}
