import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class StringUtil{
    public boolean isContain(String strA, String strB){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        strA = sc.nextLine();
        System.out.println("Enter the second string: ");
        strB = sc.nextLine();
        
    }

    public String reverse(String str) {
        char ch;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
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

    public String camelCase(String input) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        input = str.substring(0, 1).toUpperCase()+ str.substring(1);

        while (str.contains(" ")) {
            input = str.replaceFirst(" [a-z]", String.valueOf(Character.toUpperCase(str.charAt(str.indexOf(" ") + 1))));
        }
        return input;
    }

    public String longestWord(String input) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
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

    public Map<String, Integer> countWords(String input){
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
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
        reverse(HelloWorld);
        
    }
}