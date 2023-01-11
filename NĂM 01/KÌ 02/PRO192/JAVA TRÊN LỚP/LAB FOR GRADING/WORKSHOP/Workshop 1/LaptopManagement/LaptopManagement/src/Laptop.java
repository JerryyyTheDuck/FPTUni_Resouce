
public class Laptop{


    
    class USBPort {

        private String brand;
        private String technology;

        public USBPort() {
            brand = "";
            technology = "";
        }

        public USBPort(String brand, String technology) {
            this.brand = brand;
            this.technology = technology;
        }

        public String getBrand() {
            return brand;
        }

        public String getTechnology() {
            return technology;
        }

        public void setText(String brand) {
            this.brand = brand;
        }

        public void setTechnology(String technology) {
            this.technology = technology;
        }
        public void output(){
            System.out.println("technology:" + technology);
            System.out.println("brand:" + brand);
        
        }
    }
    private int id;
    private String name;
    private int price;
    private USBPort port;
    
    public Laptop() {
        id = 0;
        name = "";
        price = 0;
        port = new USBPort();
    }

    public Laptop(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        port = new USBPort();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void output(){
        System.out.println("id: " + id);
        System.out.println("price: "+ price);
        System.out.println("name: " + name);
        port.output();
    }
    public void onLaptop() {
        VNRemote remote = new VNRemote() {
            @Override
            public void onDevice() {
                System.out.println("ON device");            }

            @Override
            public void offDevice() {
                System.out.println("OFF device");            }
        };
        remote.onDevice();
        System.out.println("Have a nice day xD");
    }
}
