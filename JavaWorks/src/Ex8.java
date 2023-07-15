import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt();
        sc.close();

        calChange(num);
    }

    //---------------------- ----------------//
    public static void calChange(int num) {
        //หาค่าเงินทอน และ change ไว้เก็บค่าเงินที่เหลือ
        int change = 1000 - num;
        System.out.println("Change " + change + " baht");

        int[] banknotes = {500, 100, 50, 20};
        int[] coins = {10, 5, 1};

        //หาจำนวนแบงค์ที่ใช้
        for (int i = 0; i < banknotes.length; i++) {
            int count = change / banknotes[i]; //ไว้เช็คต้องทอนกี่ใบ
            if (count > 0) {
                System.out.println(banknotes[i] + " baht " + count + " banknote");
                change = change - count * banknotes[i]; //จำนวนเงินที่เหลือ
            }
        }//end loop

        //หาจำนวนเหรียญที่ใช้
        for (int i = 0; i < coins.length; i++) {
            int count = change / coins[i];//ไว้เช็คต้องทอนกี่เหรียญ
            if (count > 0) {
                System.out.println(coins[i] + " baht " + count + " coin");
                change = change - count * coins[i]; //จำนวนเงินที่เหลือ
            }
        }//end loop        
    }
    //---------------------- ----------------//
}
