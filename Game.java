import java.util.*;

public class Game
{
    public static int CheckInt(int Min, int Max) 
    {
        Scanner sc = new Scanner(System.in);

        int num;
        do 
        {
            try 
            {
                System.out.print("Nhập số bạn đoán (0-100) : ");
                num = Integer.parseInt(sc.nextLine());
                if (num >= Min && num <= Max)
                {
                    break;
                } 
                else 
                {
                    System.err.println("Nhập sai ! Xin hãy nhập số trong khoảng 0 - 100 !");
                }
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Nhập sai ! Xin hãy nhập lại !");
            }
        } 
        while (true);
        return num;
    }

    public static void main(String[] args) 
    {
        System.out.println("=== Game đoán số ! ===");

        Random rd = new Random();
        int random = rd.nextInt(100 - 0) + 0;
        int count = 1;

        while (true)
        {
            int n = CheckInt(0, 100);
            if (n < random)
            {
                System.out.println("Số bạn gõ vào nhỏ quá !");
                count++;
            }
            else if (n > random)
            {
                System.out.println("Số bạn gõ vào lớn quá !");
                count++;
            }
            else 
            {
                System.out.println("Tuyệt bạn đoán đúng rồi !");
                System.out.println("Bạn đã đoán tổng cộng " + count + " lần !");
                break;
            }
        }
    }
}