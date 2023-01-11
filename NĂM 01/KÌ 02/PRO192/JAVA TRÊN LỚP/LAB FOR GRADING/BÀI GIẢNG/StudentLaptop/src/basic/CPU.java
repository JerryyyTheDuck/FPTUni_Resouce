import java.util.Scanner;

public class CPU {

    private String company;
    private int core;
    private String gen;

    public CPU() {
        company = "";
        core = 0;
        gen = "";
    }
    public CPU(String company, int core, String gen) {
        this.company = company;
        this.core = core;
        this.gen = gen;
    }
  
    public String getCompany() {
        return company;
    }
    public int getCore() {
        return core;
    }
    public String getGen() {
        return gen;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void setCore(int core) {
        this.core = core;
    }
    public void setGen(String gen) {
        this.gen = gen;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        boolean check = false;
        System.out.print("Enter company:");
        company = s.nextLine();
        do {
            try {
                System.out.print("Enter core: ");
                core = Integer.parseInt(s.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai so core");
            }
        } while (!check);

        System.out.print("Enter gen: ");
        gen = s.nextLine();
    }
    public void output(){
        System.out.format("%10s%20d%20s",company,core,gen);
        System.out.println("");
    }
    
}
