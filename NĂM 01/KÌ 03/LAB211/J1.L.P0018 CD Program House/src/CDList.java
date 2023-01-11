
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class CDList {
    
    private int cdCounter;
    private final int MAX = 700;
    private CD[] list;
    
    public CDList() {   
        cdCounter = 0;
        list = new CD[MAX];
    }

    public CDList(int cdCounter) {
        this.cdCounter = cdCounter;
        list = new CD[MAX];
    }

    public int getCdCounter() {
        return cdCounter;
    }
    
    public void setCdCounter(int cdCounter) {
        this.cdCounter = cdCounter;
    }
    public boolean addCDToList(CD cd) {
        if (cdCounter < MAX) {
            list[cdCounter] = cd;
            cdCounter++;
            return true;
        }
        return false;
    }

    public CD findCDInList(String title) {
        if (cdCounter > 0) {
            for (int i = 0; i < cdCounter; i++) {
                if (list[i].getTitle().equals(title)) {
                    return list[i];
                }
            }
        }
        return null;
    }

    public void displayCDInList() {
        if (cdCounter > 0) {
            System.out.println("\tTHE RESULT");
            System.out.format("%-20s%-20s%-20s%-20S%-20s%-20S\n", "COLLECTION NAME", "TYPE", "TITLE", "UNIT PRICE", "ID", "PUBLISHING YEAR");
            for (int i = 0; i < cdCounter; i++) {
                list[i].outputCDInfo();
            }
//            System.out.println(cdCounter);    
        } else {
            System.out.println("no data");
        }
    }

    public CD updateItemInfo(CD c) {
        c.updateInfo();
        return c;
    }

    public int getIndex(CD cd) {
        if (cdCounter > 0) {
            for (int i = 0; i < cdCounter; i++) {
                if (list[i].equals(cd)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index < MAX) {
            for (int j = index; j < cdCounter; j++) {
                list[j] = list[j + 1];
            }
            cdCounter--;
            return true;
        }
        return false;
    }

    public String getToString(int index) {
        return list[index].toString();
    }

    public void writeFile() {
        Tool.writeFile(this);
    }

    public void readCurrenFile() {
        CDList list1 = Tool.readFile();
        list1.displayCDInList();
    }

    public boolean checkEmpty() {
        return cdCounter == 0;
    }

    public void updateInList(CD cd) {
        cd.updateInfo();
    }

    public int getCDCounterInFile() {
        int index = 0;
        try {
            FileReader fr = new FileReader("CD.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                index++;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return index;
    }

}
