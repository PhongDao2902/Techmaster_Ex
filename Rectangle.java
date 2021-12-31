package Exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Hãy nhập chiều dài: ");
            int length = scan.nextInt();
            System.out.print("Hãy nhập chiều rộng: ");
            int height = scan.nextInt();
            for (int i = 0; i < height; i++) {
                System.out.println("");
                for (int j = 0; j < length; j++) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
