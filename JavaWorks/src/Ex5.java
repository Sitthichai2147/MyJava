import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num (1-4): ");
        int num = sc.nextInt();
        sc.close();

        //เช็คหาก input มามากกว่า 4
        if (num < 1 || num > 4) {
            System.out.println("Invalid Input must be number(1-4)");
            return;
        }

        //---------------- draw ---------------------//
        int firstNum = 1;// เลขตัวแรก
        
        for (int i = 1; i <= num; i++) {
            // วาด space
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            // วาด เลข กับ space ระหว่างเลข
            for (int k = 1; k <= i; k++) {
                System.out.print(firstNum % 10 + " ");
                firstNum = firstNum + 1; //ให้ค่าเลขตัวแรกบวกเพิ่มไว้แสดงเลขต่อไป
            }
            // ขึ้นบรรทัดใหม่
            System.out.println();
        }//end loop
    }
}