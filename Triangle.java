package Exercises;

public class Triangle{
    public static void main(String[] args) {
        System.out.println(isValidTriangle(4, 5, 6));
    }

    public static boolean isValidTriangle(int a, int b, int c){
        return (a + b > c && b + c > a && c + a > b);
    }


}
