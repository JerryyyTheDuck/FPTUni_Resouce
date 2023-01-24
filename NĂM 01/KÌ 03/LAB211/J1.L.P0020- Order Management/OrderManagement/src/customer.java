import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class customer {
    //Information in a line:
    //<customerID, customerName, customerAddress, customerPhone >
    private String customerID;
    private String customerName;
    private String customerAddress;
    private String customerPhone;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    //=======================================
    public void printAll(List<customer> customerList) {
        if (customerList.isEmpty()) {
            System.out.println("Nothing to print");
        } else {
            for (customer i : customerList) {
                System.out.println("Customer ID: " + i.customerID);
                System.out.println("Customer Name: " + i.customerName);
                System.out.println("Address: " + i.customerAddress);
                System.out.println("Phone: " + i.customerPhone);
                System.out.println("----------------");
            }
            System.out.println("===============");

        }
    }

    public void printSingleCustomer(customer i) {
        System.out.println("Customer ID: " + i.customerID);
        System.out.println("Customer Name: " + i.customerName);
        System.out.println("Address: " + i.customerAddress);
        System.out.println("Phone: " + i.customerPhone);
        System.out.println("---------------");
    }

    public void printSearchedCustomer(List<customer> customerList) {
        Scanner sc = new Scanner(System.in);
        if (customerList.isEmpty()) {
            System.out.println("Empty list, nothing to search");
            return;
        } else {
            int count = 0;
            String check = Tools.inputString("Input ID to search: ", "^[A-Za-z][0-9]{3}$", "Invalid ID !!");
            for (customer c : customerList) {
                if (c.customerID.equalsIgnoreCase(check)) {
                    printSingleCustomer(c);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("There is no ID found with this ID you typed !");
            }
        }
    }

    public void addCustomer(List<customer> customerList) {
        customer cus = new customer();
        boolean check = false;
        do {
            int count = 0;
            cus.setCustomerID(Tools.inputString("Input ID: ", "^[C][0-9]{3}$", "Invalid ID !!"));
            for (customer c : customerList) {
                if (c.customerID.equalsIgnoreCase(cus.getCustomerID())) {
                    System.out.println("Already have this ID ~~");
                    count++;
                    break;
                }
            }
            if(count == 0){
                check = true;
            }
        } while (check == false);

        cus.setCustomerName(Tools.inputString("Input name: ", "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)", "Invalid Name"));
        cus.setCustomerAddress(Tools.inputString("Input Address: ", "^[#.0-9a-zA-Z\\s,-]+$", "Invalid Address"));
        cus.setCustomerPhone(Tools.inputString("Input Phone number: ", "^[0-9\\-\\+]{9,15}$", "Invalid Phone Number"));
        customerList.add(cus);
    }

    public void updateCustomer(List<customer> customerList) {
        int count = 0;
        if (customerList.isEmpty()) {
            System.out.println("Empty list");
        } else {
            String check = Tools.inputString("Input ID to search: ", "^[A-Za-z][0-9]{3}$", "Invalid ID !!");
            for (customer cus : customerList) {
                if (cus.customerID.equalsIgnoreCase(check)) {
                    customerList.remove(cus);
                    addCustomer(customerList);
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("There is no ID found with this ID you typed !");
            }
        }
    }


    @Override
    public String toString() {
        return customerID + ',' + customerName + ',' + customerAddress + ',' + customerPhone;
    }

    //=======================================================
    public void writeFile(List<customer> customerList) {
        try {
            FileWriter fr = new FileWriter("named.txt");
            BufferedWriter bw = new BufferedWriter(fr);
            for (int i = 0; i < customerList.size(); i++) {
                bw.write(customerList.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<customer> readCustomerFile() {
        List<customer> customerList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("customers.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                customer cus = new customer();
                String text[] = line.split(",");
                cus.setCustomerID(text[0]);
                cus.setCustomerName(text[1]);
                cus.setCustomerAddress(text[2]);
                cus.setCustomerPhone(text[3]);
                customerList.add(cus);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
