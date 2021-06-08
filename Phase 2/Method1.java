
public class Method1 {
    public static void main(String[] args) {
        display();
        plus();

    }
   // การสร้างMethod
    static void display() {
     

        // กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("Hello world");
    }

    static void plus() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("ผลบวก " + c);

    }
//สมมุติ
    static void open_video() {
        System.out.println("เปิดวีดีโอ");
    }

    static void play_video() {
        System.out.println("เล่นวีดีโอ");
    }

    static void stop_video() {
        System.out.println("หยุดวีดีโอ");
    }
}