package Exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import java.util.HashMap;

public class Final {
    public static void main(String[] args) {
        ArrayList<String> email = new ArrayList<String>();
        HashMap<String, String> accounts = new HashMap<String, String>();
        try (Scanner scan = new Scanner(System.in)) {

            boolean n = true;
            while (n) {
                System.out.println("1 - Đăng nhập");
                System.out.println("2 - Đăng ký");
                String number1 = scan.nextLine();
                switch (number1) {
                    case "1":
                        boolean loginCheck = true;
                        while (loginCheck) {
                            System.out.print("Nhập username: ");
                            String userIn = scan.nextLine();
                            if (accounts.containsKey(userIn)) {
                                System.out.print("Nhập password: ");
                                String passIn = scan.nextLine();
                                if (passIn.matches(accounts.get(userIn))) {
                                    System.out.println(
                                            "Chào mừng" + userIn + ", bạn có thể thực hiện các công việc sau: ");
                                    boolean loggedIn = true;
                                    while (loggedIn) {
                                        System.out.println("1 - Thay đổi username");
                                        System.out.println("2 - Thay đổi email");
                                        System.out.println("3 - Thay đổi mật khẩu");
                                        System.out.println("4 - Đăng xuất");
                                        System.out.println("0 - Thoát chương trình");
                                        String number2 = scan.nextLine();
                                        switch (number2) {
                                            case "0":
                                                System.exit(0);
                                                break;
                                            case "1":
                                                System.out.print("Hãy nhập username mới: ");
                                                String newUser = scan.nextLine();
                                                accounts.remove(userIn);
                                                accounts.put(newUser, passIn);
                                                System.out.println("Thay đổi username thành công!");
                                                break;
                                            case "2":
                                                System.out.print("Hãy nhập email muốn thay đổi: ");
                                                String oldMail = scan.nextLine();
                                                System.out.print("Hãy nhập emai mới: ");
                                                String newMail = scan.nextLine();
                                                email.set(email.indexOf(oldMail), newMail);
                                                System.out.println("Thay đổi email thành công!");
                                                break;
                                            case "3":
                                                loggedIn = false;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } else {
                                    System.out.println("Mật khấu sai!");
                                    System.out.println("1 - Đăng nhập lại");
                                    System.out.println("2 - Quên mật khẩu");
                                    String fpassCheck = scan.nextLine();
                                    switch (fpassCheck) {
                                        case "1":
                                            break;
                                        case "2":
                                            System.out.print("Hãy nhập email sử dụng để đăng kí: ");
                                            String mailCheck = scan.nextLine();
                                            if (email.contains(mailCheck)) {
                                                System.out.print("Hãy nhập mật khẩu mới: ");
                                                String newPass = scan.nextLine();
                                                accounts.remove(userIn);
                                                accounts.put(userIn, newPass);
                                                System.out.println("Thay đổi mật khẩu thành công.");
                                            } else {
                                                System.out.println("Chưa tồn tại tài khoản.");
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            } else {
                                System.out.println("Kiểm tra lại username");
                            }
                        }
                        break;
                    case "2":
                        System.out.print("Nhập email: ");
                        String mailReg = scan.nextLine();
                        if (isValid(mailReg)) {
                            if (email.contains(mailReg)) {
                                System.out.println("Đã có tài khoản sư dụng email này!");
                                break;
                            } else {
                                email.add(mailReg);
                                System.out.print("Tạo username: ");
                                String userReg = scan.nextLine();
                                boolean passCheck = true;
                                while (passCheck) {
                                    String passRegex = "^(?=[A-Z])(?=.*[. , - _ ;]).{7,15}$";
                                    Pattern pat = Pattern.compile(passRegex);
                                    System.out.print("Tạo pasword: ");
                                    String passReg = scan.nextLine();
                                    if (pat.matcher(passReg).matches()) {
                                        accounts.put(userReg, passReg);
                                        System.out.println("Tạo tài khoản thành công!");
                                        passCheck = false;
                                    } else {
                                        System.out.println(
                                                "Password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)");
                                    }
                                }
                            }
                        } else {
                            System.out.println("Email sai, xin thử lại.");
                        }
                        break;
                }
            }
        }
    }

    public static boolean isValid(String email) {
        String emailRegex = "^(.+)@(.+)$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
