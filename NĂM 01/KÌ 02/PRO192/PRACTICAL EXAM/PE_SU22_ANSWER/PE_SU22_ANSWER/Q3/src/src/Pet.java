
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class Pet implements ITax {

    private String name;
    private String birthday;
    private ArrayList<Service> list;

    public Pet() {
    }

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        list = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Service> getList() {
        return list;
    }

    public void setList(ArrayList<Service> list) {
        this.list = list;
    }

    public void addService(String nameService, int price) {
            list.add(new Service(nameService, price));
    }

    @Override
    public double getTax() {
        return VAT * getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
        double getMoney = (double)getMoney();
        String[] month = getBirthday().split("/");
        if (month[0].contains("9") || month[0].contains("10") || month[0].contains("11")
                || month[0].contains("12")) {
            return getMoney * 0.95;
        }
        return getMoney();
    }

    public int getMoney() {
        int count = 0;
        for (Service service : list) {
            count = count + service.getPrice();
        }
        return count;
    }

    @Override
    public String toString() {
        double getTotalMoney = getTotalMoney();
        double getTax = getTax();
        return name + "-" + getTotalMoney + "-" + getTax;
    }

}
