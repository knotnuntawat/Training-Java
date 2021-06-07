import java.util.*;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ป้อนอายุของคุณ : ");
        int age = sc.nextInt();
if(age>=15 && age<=17){
    System.out.println("ม.ต้น");
}if(age>=18 && age<=20){
    System.out.println("ม.ปลาย");
}else{
    System.out.println("อื่นๆ");
}
//ทดสอบ
        sc.close();
    }
}
