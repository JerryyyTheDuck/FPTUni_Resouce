
import java.util.InputMismatchException;
import java.util.Scanner;

public class maTran {

    int row, column;
    int m[][];
    //=====================================

    public void input() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("enter number of row: ");
                row = Integer.parseInt(s.nextLine());
                if (row == 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Wrong input");
            }
        }

        boolean check = false;
        do {
            try {
                System.out.print("enter number of column: ");
                column = Integer.parseInt(s.nextLine());
                if(column == 0){
                    throw new InputMismatchException();
                }
                check = true;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Wrong input");
            }
        } while (!check);

        m = new int[row][column];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("m[" + i + "][" + j + "]=");
                m[i][j] = s.nextInt();
            }
        }
    }

    public void output() {
        System.out.println("Matrix Inputted:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int sum() {
        int tong = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                tong = tong + m[i][j];
            }
        }

        return tong;
    }

    public double average() {
        int a = sum();
        double b = (double) a / (row * column);
        return b;

    }
}
