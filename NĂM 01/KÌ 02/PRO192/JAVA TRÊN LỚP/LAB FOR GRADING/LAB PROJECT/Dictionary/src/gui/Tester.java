/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import data.Vocabulary;
import java.util.Scanner;

/**
 *
 * @author green
 */
public class Tester {

    public static void main(String[] args) {
        int choice;
        Vocabulary vocablist = new Vocabulary();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("1. Print all word");
            System.out.println("2. Add in a word");
            System.out.println("3. Search word in dictionary");
            System.out.println("4. Search Max word in dictionary");
            System.out.println("5. Find Max group in dictionary");
            System.out.println("6. Delete a word");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(s.nextLine());
            switch (choice) {
                case 1:
                    if (vocablist.checkInDict()) {
                        vocablist.displayAll();
                    } else {
                        System.out.println("nothing to display");
                        System.out.println("===================");
                    }
                    break;
                case 2:
                    vocablist.init();
                    vocablist.addWord();
                    break;
                case 3:
                    String search;
                    if (vocablist.checkInDict()) {
                        while (true) {
                            try {
                                System.out.print("Input word to search: ");
                                search = s.nextLine();
                                if (search.matches("^[a-zA-Z]$")) {
                                    throw new Exception();
                                }

                                if (vocablist.searchWord(search)) {
                                    System.out.println("Have this");
                                } else {
                                    System.out.println("Don't have in this dict");
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("Invalid input word");
                            }
                        }
                    } else {
                        System.out.println("nothing to search");
                        System.out.println("===================");
                    }
                    break;
                case 4:
                    if (vocablist.checkInDict()) {
                        vocablist.findMaxWord();
                        System.out.println("Done.");
                        System.out.println("===================");

                    } else {
                        System.out.println("Nothing to search the max word");
                        System.out.println("===================");

                    }
                    break;
                case 5:
                    if (vocablist.checkInDict()) {
                        vocablist.findMaxGroup();
                    } else {
                        System.out.println("Nothing to search the max group");
                        System.out.println("==================");
                    }
                    break;
                case 6:
                    String check;
                    if (vocablist.checkInDict()) {
                        while (true) {
                            try {
                                System.out.print("Input word to delete: ");
                                check = s.nextLine();
                                if (check.matches("^(a-AZ-z)$")) {
                                    throw new Exception();
                                }
                                vocablist.deleteWord(check);
                                System.out.println("Done");
                                break;
                            } catch (Exception e) {
                                System.out.println("Invalid word");
                            }
                        }
                    } else {
                        System.out.println("Nothing to delete");
                        System.out.println("==================");
                    }
            }
        } while (choice < 7);
    }
}
