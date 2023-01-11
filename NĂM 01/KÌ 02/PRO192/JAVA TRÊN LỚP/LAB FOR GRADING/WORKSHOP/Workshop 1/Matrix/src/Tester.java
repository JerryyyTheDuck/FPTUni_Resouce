public class Tester {
    public static void main(String[] args) {
        maTran a = new maTran();
        a.input();
        a.output();
        int b = a.sum();
        System.out.println("Sum: " + b);
        double c = a.average();
        System.out.println("Average: "+ c);
        
        
    }
}
