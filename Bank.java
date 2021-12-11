package Exercises;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Bank {
    public static void main(String[] args) {
        int bal = 5000000;
        try (Scanner scan = new Scanner(System.in)) {
            Boolean n1 = true;
            Boolean n2 = true;
            ArrayList<ArrayList<String>> history = new ArrayList<ArrayList<String>>();
            while(n1){
                System.out.println("Đăng Nhập:");
                System.out.print("Số điện thoại: ");
                String number = scan.nextLine();
                if(number.matches("[0-9]+")){
                    System.out.print("Nhập mật khẩu: ");
                    String password = scan.nextLine();                   
                    if(password.length() != 0){
                        while(n2){
                            System.out.println("1.Truy vấn số dư tài khoản");
                            System.out.println("2.Chuyển tiền");
                            System.out.println("3.Xem lịch sử giao dịch");
                            System.out.println("4.Thoát");
                            String selection = scan.nextLine();
                            switch(selection){
                                case "1":
                                    System.out.println("Tài khoản của bạn hiện đang có: " + bal + "VND");
                                    break;
                                case "2":
                                    boolean a = true;
                                    while(a){
                                        ArrayList<String> stk = new ArrayList<String>();
                                        ArrayList<String> transDate = new ArrayList<String>();
                                        ArrayList<String> transDesc = new ArrayList<String>();
                                        ArrayList<String> amount = new ArrayList<String>();
                                        String passRegex = "^(?=[0-9]+).{8,16}";
                                        Pattern pat = Pattern.compile(passRegex);
                                        System.out.println("Nhập số tài khoản gửi: ");
                                        String accNo = scan.nextLine();
                                        if(pat.matcher(accNo).matches()){
                                            stk.add(accNo);
                                            boolean b = true;
                                            while(b){
                                                int transMax = bal - 50000;
                                                System.out.println("Nhập giá trị muốn gửi: ");
                                                String transNo = scan.nextLine();
                                                if(transNo.matches("[0-9]+")){
                                                    if(Integer.valueOf(transNo) < transMax){
                                                        amount.add(transNo);
                                                        System.out.println("Hãy nhập mô tả: ");
                                                        String desc = scan.nextLine();
                                                        transDesc.add(desc);
                                                        Date date = new Date();
                                                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                                                        String dateTrans = formatter.format(date);
                                                        transDate.add(dateTrans);
                                                        bal = bal - Integer.valueOf(transNo);
                                                        a = false;
                                                        b = false;
                                                    }
                                                    else{
                                                        System.out.println("Tài khoản của bạn không đủ để thực hiện giao dịch!");
                                                    }
                                                }
                                                else{
                                                    System.out.println("Hãy nhập lại!");
                                                }
                                            }
                                        }
                                        else{
                                            System.out.println("Hãy nhập lại!");
                                        }
                                        history.add(transDate);
                                        history.add(transDesc);
                                        history.add(stk);
                                        history.add(amount);
                                    }
                                    break;
                                case "3":
                                    for (int i = 0; i < history.size() ; i++) {
                                        System.out.println((i + 1) + " - " + history.get(0).get(i) + " - " + history.get(1).get(i) + " - " + history.get(2).get(i) + " - " + history.get(3).get(i) + "VND");
                                    }
                                    break;
                                case "4":
                                    n1 = false;
                                    n2 = false;
                                    break;
                                default:
                                    System.out.println("Lỗi");
                                    break;
                            }
                        }
                    }
                    else{
                        System.out.println("Đăng nhập thất bại.");
                        break;
                    }
                }
                else{
                    System.out.println("Đăng nhập thất bại.");
                    break;
                }
            }
        }
    }
}
    