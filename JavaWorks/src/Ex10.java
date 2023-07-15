import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt();
        sc.close();

    //---------------- draw ---------------------//
        for (int i = 0; i < num; i++) {
            // วาด space
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            // วาด *
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // ขึ้นบรรทัดใหม่
            System.out.println();
        }//end loop
    }
}
