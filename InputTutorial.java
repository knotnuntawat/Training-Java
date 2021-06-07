import java.util.*;

 class InputTutorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ชื่อ = ");
        String name =sc.nextLine(); 
        System.out.print("ปีเกิด พ.ศ. = ");
        int year = sc.nextInt();
        int age = 2564-year; //คำนวณอายุ
    
System.out.println("ชื่อของคุณคือ "+name);
System.out.println("ปีของคุณคือ "+year);
System.out.println("อายุคุณคือ "+age);
sc.close();
    }
}
