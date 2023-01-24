import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        int choice;
        customer c = new customer();
        product p = new product();
        order o = new order();
        List<customer> customerList = customer.readCustomerFile();
        List<product> productList = product.readProductFile();
        List<order> orderList = order.readOrdersFile();
        do {
            Tools.menu();
            choice = Tools.inputNumber("Your choice: ", "^([1-9]|1[0-9]|11)$", "Invalid choice");
            switch (choice) {
                case 1:
                    p.printAll(productList);
                    break;
                case 2:
                    c.printAll(customerList);
                    break;
                case 3:
                    c.printSearchedCustomer(customerList);
                    break;
                case 4:
                    c.addCustomer(customerList);
                    break;
                case 5:
                    c.updateCustomer(customerList);
                    break;
                case 6:
                    c.writeFile(customerList);
                    break;
                case 7:
                    o.printOrderInASC(orderList);
                    break;
                case 8:
                    o.pendingOrder(orderList);
                    break;
                case 9:
                    o.addOrder(orderList,customerList,productList);
                    break;
                case 10:
                    o.updateOrder(orderList,customerList,productList);
                    break;
                case 11:
                    o.writeFile(orderList);
                    break;
            }
        } while (choice > 0 && choice < 12);

    }
}
