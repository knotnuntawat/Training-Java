

public class Method2 {
    public static void main(String[] args) {
      /*display("Knot Nuntawat"); // Knot Nuntawat คือ Argument
        display("How are you?");*/

        fullname("Nuntawat","Subpiputtana");
        plus(5,-10);
    }
   // การสร้างMethod
    static void display(String message) { // message คือ parameter
        
        // กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println(message);
    }
    static void fullname(String firstname , String lastname) { 
        System.out.println("ชื่อ "+firstname+" นามสกุล "+lastname);
    }
    static void plus (int a , int b) { 
        int c = a+b;
        System.out.println("ผลบวก = "+c);
    }

}
