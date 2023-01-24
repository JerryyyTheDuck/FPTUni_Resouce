import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class product {
    private String productID;
    private String productName;
    private int unit;
    private String origin;
    private double price;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //===================
    public static List<product> readProductFile() {
        List<product> productList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("product.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                product p = new product();
                String text[] = line.split(",");
                p.setProductID(text[0]);
                p.setProductName(text[1]);
                p.setUnit(Integer.parseInt(text[2]));
                p.setOrigin(text[3]);
                p.setPrice(Double.parseDouble(text[4]));
                productList.add(p);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public void printAll(List<product> productList) {
        if (productList.isEmpty()) {
            System.out.println("Nothing to print");
        } else {
            for (product i : productList) {
                System.out.println("Product ID: " + i.productID);
                System.out.println("Product Name: " + i.productName);
                System.out.println("Unit: " + i.unit);
                System.out.println("Origin: " + i.origin);
                System.out.println("Price " + i.price);
                System.out.println("-----------------");
            }
            System.out.println("===============");
        }
    }
}
