package Exercises;

public class PalindromeCheck {
    public static boolean isPalindrome(String str){  
        char ch;
        String nstr = "";
        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i);
          nstr= ch+nstr;
        }  
        if (str.equals(nstr)) {
            return true;  
        }
        else{
            return false;  
        } 
    }  
    public static void main(String[] args) {
        System.out.println(isPalindrome("redivider"));
        System.out.println(isPalindrome("deified"));
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("Phong"));
    }
}
