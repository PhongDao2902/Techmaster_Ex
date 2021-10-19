package Exercises;
import java.util.*;


public class StringUtil{
    public static String reverse(String str) {
        char ch;
        String nstr = "";
        System.out.print("Original string: ");
        System.out.println(str);
        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i);
          nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
        return nstr;
    }

    public static String camelCase(String input) {
        input = input.substring(0, 1).toUpperCase()+ input.substring(1);

        while (input.contains(" ")) {
            input = input.replaceFirst(" [a-z]", String.valueOf(Character.toUpperCase(input.charAt(input.indexOf(" ") + 1))));
        }
        return input;
    }

    public static String longestWord(String input) {
        String word = "", large="";  
        String[] words = new String[100];  
        int length = 0;  
            
        input = input + " ";
          
        for(int i = 0; i < input.length(); i++){  
            if(input.charAt(i) != ' '){  
                word = word + input.charAt(i);  
            }  
            else{  
                words[length] = word;  
                length++;  
                word = "";  
            }  
        }  
          
        large = words[0];  
          
        for(int i = 0; i < length; i++){  
            if(large.length() < words[i].length())  
                large = words[i];  
        }  
          
        System.out.println("Largest word: " + large);  
        return large;
    }

    public static Map<String, Integer> countWords(String input){
        String[] arr1 = input.split(" ");
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            count = 0;

            for (int j = 0; j < arr1.length; j++) {
                String temp = arr1[j];
                String temp1 = arr1[i];

                if (j < i && temp.contentEquals(temp1)) {
                    break;
                }
                if (temp.contentEquals(temp1)) {
                    count = count + 1;
                }
                if (j == arr1.length - 1) {
                    System.out.println("The word" + arr1[i] + "appears" + count + "times");
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        reverse("Hello");
        camelCase("hôm nay trời mưa to");
        longestWord("Be yourself; everyone else is already taken.");
        countWords("Fear leads to anger; anger leads to hatred; hatred leads to conflict; conflict leads to suffering");
    }
}