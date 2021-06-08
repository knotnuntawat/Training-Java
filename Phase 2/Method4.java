

public class Method4 {
    public static void main(String[] args) {
        int result = maxNumber(10, 5);
        int result2 = minNumber(7, -3);
        int sum = summation(50, 50);
        System.out.println("ค่าที่มากที่สุดคือ : " + result);
        System.out.println("ค่าที่น้อยที่สุดคือ : " + result2);
        System.out.println("ผลรวมคือ : " + sum);
    }

    static int maxNumber(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    static int minNumber(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return b;
        }
    }

    static int summation(int x , int y){
            int total =x+y;
            return total;
            
    }

}
