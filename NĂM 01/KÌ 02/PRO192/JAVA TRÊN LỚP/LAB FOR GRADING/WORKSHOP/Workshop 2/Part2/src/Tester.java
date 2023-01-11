public class Tester {

    public static void main(String[] args) {
        StringMatch a = new StringMatch();
        a.input();
        a.output();

        StringMatch b = new StringMatch();
        while (true) {
            try {
                b.inputThrowCatch();
                b.output();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
    }
}
