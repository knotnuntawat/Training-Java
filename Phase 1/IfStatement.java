import java.util.*;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ");
        int age = sc.nextInt();

        if (age >= 19 && age <= 20) {
            System.out.println("วัยเจริญพันธุ์");
        } else if (age >= 21 && age <= 60) {
            System.out.println("วัยรุ่น");
        } else if (age >= 61 && age <= 79) {
            System.out.println("วัยทอง");
        } else if (age >= 80) {
            System.out.println("แก่แล้ว");
        } else {
            System.out.println("ไม่พบข้อมูล");
        }
        System.out.println("จบโปรแกรม");

        sc.close();
    }
}
