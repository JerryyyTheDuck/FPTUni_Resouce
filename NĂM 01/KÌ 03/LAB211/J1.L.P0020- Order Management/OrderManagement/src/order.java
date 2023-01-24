import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class order {

    //Information in a line:
    //<orderID, customerID, productID, orderQuantity, orderDate, status>
    private String orderID;
    private String customerID;
    private String productID;
    private int orderQuantity;
    private String orderDate;
    private String status;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printSingleOrder(order order) {
        System.out.println("Order ID: " + order.orderID);
        System.out.println("Customer ID: " + order.customerID);
        System.out.println("Product ID: " + order.productID);
        System.out.println("Order Quantity: " + order.orderQuantity);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Status: " + order.status);
        System.out.println("--------------------------");

    }

    public void printOrderInASC(List<order> orderList) {
        for (int x = 0; x < orderList.size(); x++) {
            for (int i = 0; i < orderList.size() - x - 1; i++) {
                if (orderList.get(i).getCustomerID().compareTo(orderList.get(i + 1).getCustomerID()) > 0) {
                    order temp = orderList.get(i);
                    orderList.set(i, orderList.get(i + 1));
                    orderList.set(i + 1, temp);
                }
            }
        }
        for (order Order : orderList) {
            printSingleOrder(Order);
        }
    }

    public void pendingOrder(List<order> orderList) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).status.equalsIgnoreCase("true")) {
                printSingleOrder(orderList.get(i));
            }
        }
    }

    public void addOrder(List<order> orderList, List<customer> customerList, List<product> productList) {
        int check;
        order o = new order();
        while (true) {
            check = 0;
            o.setOrderID(Tools.inputString("Input Order ID: ", "^[D][0-9]{3}$", "Invalid order ID"));
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).orderID.equalsIgnoreCase(o.getOrderID())) {
                    System.out.println("Already have this ID, please try again");
                    check++;
                    break;
                }
            }
            if (check == 0) {
                break;
            }
        }
        while (true) {
            check = 0;
            o.setCustomerID(Tools.inputString("Input Customer ID: ", "^[C][0-9]{3}$", "Invalid Customer ID"));
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerID().compareTo(o.getCustomerID()) == 0) {
                    System.out.println("There is no such this cus ID in the Customer list");
                    break;
                }
                if (orderList.get(i).getCustomerID().compareTo(o.getCustomerID()) == 0) {
                    System.out.println("Already have this Customer ID, please try again");
                    break;
                } else {
                    check++;
                    break;
                }
            }
            if (check != 0) {
                break;
            }
        }
        while (true) {
            int count = 0;
            check = 0;
            o.setProductID(Tools.inputString("Input product ID: ", "^[P][0-9]{3}$", "Invalid Product ID"));
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductID().compareTo(o.getProductID()) == 0) {
                    System.out.println("There is no such this product ID in the product list");
                    break;
                }
                if (orderList.get(i).getProductID().compareTo(o.getCustomerID()) == 0) {
                    System.out.println("Already have this product ID in order list, please try again");
                    break;
                } else {
                    check++;
                    break;
                }
            }
            if (check != 0) {
                break;
            }
        }
        o.orderQuantity = Tools.inputNumber("Input quantity: ", "\\d+", "Invalid number");
        o.orderDate = Tools.inputString("Input Date(dd/mm/yyyy): ", "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})$", "Invalid date format");
        o.status = Tools.inputString("Input status: ", "^([Tt][Rr][Uu][Ee]|[Ff][Aa][Ll][Ss][Ee])$", "Only input true or false");
        orderList.add(o);
    }

    public List<order> updateOrder(List<order> orderList, List<customer> customerList, List<product> productList) {
        int choice;
        do {
            System.out.println("1. Update an Order based on its ID");
            System.out.println("2. Delete an order based on its ID");
            System.out.println("3. Quit");
            choice = Tools.inputNumber("Your choice: ", "^[0-9]$", "Invalid input! ");
            switch (choice) {
                case 1:
                    updateID(orderList, customerList, productList);
                    break;
                case 2:
                    deleteID(orderList);
                    break;
            }
        } while (choice > 0 && choice < 3);

        return orderList;
    }

    public List<order> updateID(List<order> orderList, List<customer> customerList, List<product> productList) {
        if (orderList.isEmpty()) {
            System.out.println("The order list is empty !");
        } else {
            String checkID = Tools.inputString("Input ID to check: ", "^[D][0-9]{3}$", "Invalid ID");
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).orderID.equalsIgnoreCase(checkID)) {
                    orderList.remove(i);
                    addOrder(orderList,customerList,productList);
                    break;
                }
            }
        }
        return orderList;
    }

    public List<order> deleteID(List<order> orderList) {
        if (orderList.isEmpty()) {
            System.out.println("The order list is empty !");
        } else {
            String checkID = Tools.inputString("Input ID to check: ", "^[D][0-9]{3}$", "Invalid ID");
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).orderID.equalsIgnoreCase(checkID)) {
                    orderList.remove(i);
                    break;
                }
            }
        }
        return orderList;
    }


    public void writeFile(List<order> orderList) {
        try {
            FileWriter fr = new FileWriter("orders.txt");
            BufferedWriter bw = new BufferedWriter(fr);
            for (int i = 0; i < orderList.size(); i++) {
                bw.write(orderList.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<order> readOrdersFile() {
        List<order> productList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("orders.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                order o = new order();
                String text[] = line.split(",");
                o.setOrderID(text[0]);
                o.setCustomerID(text[1]);
                o.setProductID(text[2]);
                o.setOrderQuantity(Integer.parseInt(text[3]));
                o.setOrderDate(text[4]);
                o.setStatus(text[5]);
                productList.add(o);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public String toString() {
        return orderID + ',' + customerID + ',' + productID + ',' + orderQuantity + ',' + orderDate + ',' + status;
    }
}
