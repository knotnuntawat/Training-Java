import java.util.*;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("กรุณาใส่น้ำหนัก (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("กรุณาใส่ส่วนสูง (cm) : ");
        double height = sc.nextDouble();

        height /= 100;

        double bmi = weight / (height * height); // สูตร bmi

        String predict = ""; // สร้างตัวแปรว่างไว่เก็บค่า

        // เขียน code ได้ 2 วิธี

        // วิธีที่1
        /*
         * if (bmi<18){ System.out.println("Your BMI is : "+bmi+" less than stat");
         * }else if (bmi>=18.5 && bmi<=22.9){ System.out.println("Your BMI is : "+bmi+
         * " perfect bmi"); }else if (bmi>=23.0 && bmi<=24.9){
         * System.out.println("Your BMI is : "+bmi+ " a little bit Fat"); }else if
         * (bmi>=25 && bmi<=29.9){ System.out.println("Your BMI is : "+bmi+" Fat");
         * }else if (bmi>30){ System.out.println("Your BMI is : "+bmi+" Dangerous Fat");
         * }else{ System.out.println("Your BMI is : "+bmi+" No data"); }
         */

        // วิธีที่ 2
        if (bmi < 18) {
            predict = "ผอม";
        } else if (bmi >= 18.5 && bmi <= 22.99) {
            predict = "สมส่วน";
        } else if (bmi >= 23.0 && bmi <= 24.99) {
            predict = "เริ่มอ้วน";
        } else if (bmi >= 25.0 && bmi <= 29.99) {
            predict = "อ้วน";
        } else if (bmi >= 30.0 && bmi <= 70.0) {
            predict = "โรคอ้วน";
        } else {
            predict = "ไม่มีข้อมูล";
        }
        System.out.println("ค่า BMI ของคุณคือ : " + bmi + " ระดับร่างกาย " + predict);

        sc.close();
    }
}
