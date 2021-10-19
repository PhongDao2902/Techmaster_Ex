package Exercises;
import java.util.Scanner;

public class BMI {
   public static String bmiCheck(double weight, double height) {
       double bmi = weight / ( height * height) ;

       if(bmi < 18.5)
          return "BMI = " + bmi +" Bạn cần phải tăng cân";
       else if(bmi < 25)
          return "BMI = " + bmi +" Tình trạng sức khỏe của bạn ổn";
       else if(bmi < 30)
          return "BMI = " + bmi +" Bạn đang thừa cân, cần phải giảm cân ngay";
       else
          return "BMI = " + bmi +" Bạn đang béo phì, có khả năng ảnh hưởng xấu tới sức khỏe";
   }

   public static void main(String[] args) {

      double weightInKg = 0.0f;
      double heightInMeters = 0.0f;
      String result;

      Scanner scan = new Scanner(System.in);
      System.out.print("Nhập cân nặng (Kg): ");
      weightInKg = scan.nextDouble();
      System.out.print("Nhập chiều cao (m): ");
      heightInMeters = scan.nextDouble();

      result = bmiCheck( weightInKg, heightInMeters );

      System.out.println(result);

   }
}