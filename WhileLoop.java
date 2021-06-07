public class WhileLoop {
    public static void main(String[] args) {

        // คำสั่ง while ทำเมื่อเป็นจริง ถ้าเป็นเท็จจะโดดออก
        int count = 1;

        // while(เงื่อนไข){
        // ทำอะไร
        // while (count <= 20) {
        while (true) { //เงื่อนไขจริง infinity ปริ้น
            System.out.println("รอบที่ " + count + " Hello World");
            count++;
            if (count >100) {
                break;     // หยุด while (true)
            }
        }
    }
} 
