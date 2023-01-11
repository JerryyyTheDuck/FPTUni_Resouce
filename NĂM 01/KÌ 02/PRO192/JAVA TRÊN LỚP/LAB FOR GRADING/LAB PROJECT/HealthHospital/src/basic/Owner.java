package basic;

import java.util.Scanner;

public class Owner {

    private int id;
    private String name;
    private String address;
    private int noPet;
    private final int MAX = 100;
    private Pet[] pets;

    public Owner() {
        id = 0;
        name = "";
        address = "";
        noPet = 0;
        pets = new Pet[MAX];
    }
    public Owner(int id, String name, String address, int noPet) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.noPet = noPet;
        pets= new Pet[MAX];

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getNoPet() {
        return noPet;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNoPet(int noPet) {
        this.noPet = noPet;
    }

    public void inputOwnerInfo() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input id: ");
                id = Integer.parseInt(s.nextLine());
                if (id <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }

        while (true) {
            try {
                System.out.print("Input name: ");
                name = s.nextLine();
                if (!name.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Name");
            }
        }

        while (true) {
            try {
                System.out.print("Input address: ");
                address = s.nextLine();
                if (!address.matches("^(\\d+) ?([A-Za-z](?= ))? (.*?) ([^ ]+?) ?((?<= )APT)? ?((?<= )\\d*)?$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid address");
            }
        }
    }
    public void ouputOwnerInfo() {
        System.out.println(id + "-" + name + "-" + address);
    }

    public boolean addPetsForOwner(Pet pet) {
        if (noPet < MAX) {
            pets[noPet] = pet;
            noPet++;
            return true;
        }
        return false;
    }
    public Pet findPetOfOwner(int id) {
        if (noPet > 0) {
            for (int i = 0; i < noPet; i++) {
                if (pets[i].getId() == id) {
                    return pets[i];
                }
            }
        }
        return null;
    }
    public void displayPetofOwner() {
        if (noPet > 0) {
            for (int i = 0; i < noPet; i++) {
                pets[i].outputPetInfo();
                pets[i].displayServiceUsedByPet();
            }
        } else {
            System.out.println("No Pet for this owner");
        }
    }
}

