import java.util.*;

public class Method3 {
    public static void main(String[] args) {
        
     //โปรแกรมหลัก
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนเงินเดือน : ");
        double salary = sc.nextDouble();
        System.out.println("เงินเดือน : "+salary);
        double bonus = getBonus(); 
         salary+=bonus;
         System.out.println("เงินเดือน + โบนัส: "+salary);
         System.out.println("ที่อยู่ : "+getProvince());
         sc.close();
    }
// modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อเมธอด(){}
  static String getIP(){
      return"192.168.1.1";
  }
  static Double getBonus(){
    return 5000.0;
}static void fullname(){
 //กระบวนการทำงานในโปรแกรมย่อย
}static String getProvince(){
    return "ชลบุรี";
    

}

}