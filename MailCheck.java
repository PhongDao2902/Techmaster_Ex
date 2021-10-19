package Exercises;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailCheck {
    public static boolean isValid(String email)
    {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static void main(String[] args)
    {
        String email = "vietphongdao2002@gmail.com";
        if (isValid(email))
            System.out.print("The email is valid");
        else
            System.out.print("The email is invalid");
    }
}
