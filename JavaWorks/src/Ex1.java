public class Ex1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int sum = 5;
        System.out.println("array1 = {1, 2, 3, 4, 5}, Sum = 5");
        System.out.println("Result:");
        calPairs(array1, sum);

        System.out.println();
        int[] array2 = {1, 2, 3, 4, 5};
        sum = 4;
        System.out.println("array2 = {1, 2, 3, 4, 5}, Sum = 4");
        System.out.println("Result:");
        calPairs(array2, sum);
    }

    //-------------------- -----------------------//
    public static void calPairs(int[] array, int sum) {
        boolean[] visited = new boolean[array.length]; //ไว้เช็คเลขที่ถูกจับคู่แล้วใน array

        //ลูปไว้เช็ค array ทีละตัวเริ่มจากตัวแรกเช็คกับทุกตัวใน array ว่าบวกเป็น sum ไหมจนครบ
        for (int i = 0; i < array.length; i++) { 
                for (int j = i + 1; j < array.length; j++) {
        //เช็คว่า array i กับ array j บวกกันได้เท่ากับ sum ไหมแล้วต้องไม่เคยถูกจับคู่ด้วย
                    if (array[i] + array[j] == sum && !visited[i] && !visited[j]) {
                        visited[i] = true;
                        visited[j] = true;
                        System.out.println(array[i] + ", " + array[j]);
                    }
            }
        }
    }
    //-------------------- -----------------------//
}
