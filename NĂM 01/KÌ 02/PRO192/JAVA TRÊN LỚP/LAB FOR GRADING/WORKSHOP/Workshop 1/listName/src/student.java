import java.util.Scanner;
public class student {
        String[] list;
        //method
        
        Scanner s = new Scanner(System.in);
        public void input(int n){
            list = new String[n];
            for(int i = 0; i < n; i++){
                System.out.print("Sinh vien " + (i+1) + ": ");
                list[i] = s.nextLine().toUpperCase();
            }
        }
        
        public void output(int n){
            for(int i = 0; i<n;i++){
                System.out.println(list[i]);
            }
        }
}
