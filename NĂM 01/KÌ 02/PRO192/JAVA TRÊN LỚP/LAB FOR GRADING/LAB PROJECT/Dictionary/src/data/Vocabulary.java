/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.*;

/**
 *
 * @author green
 */
public class Vocabulary {

    Scanner s = new Scanner(System.in);
    HashMap<String, TreeSet<String>> vocabTable;

    public Vocabulary() {
        vocabTable = new HashMap();
    }

    public void init() {
        TreeSet<String> tree1 = new TreeSet();
        tree1.add("apple");
        tree1.add("ant");
        vocabTable.put("a", tree1);

        TreeSet<String> tree2 = new TreeSet();
        tree2.add("book");
        tree2.add("but");
        vocabTable.put("b", tree2);

        TreeSet<String> tree3 = new TreeSet();
        tree3.add("could");
        tree3.add("can");
        tree3.add("can");
        vocabTable.put("c", tree3);

    }

    public void displayAll() {
        Set<String> key = vocabTable.keySet();
        for (String string : key) {
            System.out.print(string + ": ");
            TreeSet<String> value = vocabTable.get(string);
            for (String letter : value) {
                System.out.print(letter + "\t");
            }
            System.out.println("");
        }
        System.out.println("==================");

    }

    public boolean checkWordFirstLetter(String wordCheck) {
        Set<String> key = vocabTable.keySet();
        for (String string : key) {
            char firstLetter = string.charAt(0);
            if (wordCheck.charAt(0) == firstLetter) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInDict() {
        Set<String> key = vocabTable.keySet();
        if (!key.isEmpty()) {
            return true;
        }
        return false;
    }

    public void addWord() {
        String word;
        try {
            while (true) {
                System.out.print("Input word to add: ");
                word = s.nextLine();
                if (word.matches("^[a-zA-Z]$")) {
                    throw new Exception();
                }
                word.toLowerCase();
                if (checkWordFirstLetter(word)) {
                    Set<String> key = vocabTable.keySet();
                    for (String string : key) {
                        if (string.charAt(0) == word.charAt(0)) {
                            TreeSet<String> value = vocabTable.get(string);
                            value.add(word);
                        }
                    }
                    System.out.println("Done.");
                    System.out.println("=======================");

                } else {
                    TreeSet<String> tree = new TreeSet();
                    tree.add(word);
                    Character c = word.charAt(0);
                    vocabTable.put(c.toString(), tree);
                    System.out.println("Done");
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("Invalid word");
        }
    }

    public boolean searchWord(String word) {
        Set<String> key = vocabTable.keySet();
        for (String string : key) {
            if (checkWordFirstLetter(word)) {
                TreeSet<String> value = vocabTable.get(string);
                for (String letter : value) {
                    if (letter.equals(word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void findMaxWord() {
        int max = 1;
        String maxWord = "";
        Set<String> key = vocabTable.keySet();
        for (String string : key) {
            TreeSet<String> value = vocabTable.get(string);
            for (String letter : value) {
                if (letter.length() > max) {
                    max = letter.length();
                    maxWord = letter;
                }
            }
        }
        System.out.println("The longest word is: " + maxWord + " with a length of " + max);
    }

    public void findMaxGroup() {
        String maxKey = "";
        Set<String> key = vocabTable.keySet();
        int max = 0;
        for (String string : key) {
            TreeSet<String> value = vocabTable.get(string);
            if (value.size() > max) {
                max = value.size();
                maxKey = string;
            }
        }

        for (String string : key) {
            TreeSet<String> value = vocabTable.get(string);
            if (maxKey.equals(string)) {
                for (String letter : value) {
                    System.out.print(letter + "\t");
                }
            }
        }
        System.out.println("\n");

    }

    public void deleteWord(String word) {
        Set<String> key = vocabTable.keySet();

        if (checkWordFirstLetter(word)) {
            for (String string : key) {
                TreeSet<String> value = vocabTable.get(string);
                Iterator i = value.iterator();
                String check = "";
                while (i.hasNext()) {
                    check = (String) i.next();
                    if (check.equals(word)) {
                        i.remove();
                        System.out.println("Has been removed");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Don't have this word to delete");

        }
        for (String string : key) {
            TreeSet<String> value = vocabTable.get(string);
            if (value.isEmpty()) {
                vocabTable.remove(string);
            }
        }
    }
}
