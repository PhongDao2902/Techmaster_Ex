package Exercises;

public class Pairs {
    static void printPairs(String arr[]){   
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] != arr[j]){
                    System.out.print("(" +  arr[i]+ ", " + arr[j]+ ")" + ", ");
                }
            }
        }
    }
  
    public static void main(String[] args){
        String arr[] = { "Thuỵ Sĩ", "Tây Ban Nha", "Bỉ", "Italy" };
    
        printPairs(arr);    
    }
}