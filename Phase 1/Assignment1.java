import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("กรุณาใส่น้ำหนัก(kg) ");
        double weight = sc.nextDouble();
        System.out.print("กรุณาใส่ส่วนสูง(cm) ");
        double height = sc.nextDouble();
        height /= 100; // หรือ height=height/100;

        double bmi = weight / (height * height); // สูตร BMI

        System.out.println("น้ำหนัก = " + weight);
        System.out.println("ส่วนสูง = " + height);
        System.out.println("ดัชนีมวลกาย (ฺBMI) = " + bmi);
        sc.close();
    }
}
