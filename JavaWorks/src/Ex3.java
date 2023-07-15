public class Ex3 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 4, 6, 9, 10, 14, 16, 17};

        System.out.println("array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");
        System.out.println("Result: " + dateRange(array1));
        System.out.println("array2 = {1, 4, 6, 9, 10, 14, 16, 17}: ");
        System.out.println("Result: " + dateRange(array2));
    }

    //-------------------- -------------------//
    public static String dateRange(int[] array) {
        String result = "";
        int start = array[0]; //ไว้จำวันที่เริ่มออกอากาศต่อเนื่อง
        int end = array[0]; //ไว้จำวันที่จบการออกอากาศต่อเนื่อง

        for (int i = 1; i < array.length; i++) {
            //เช็คว่ามีวันออกอากาศต่อกันไหม
            if (array[i] == end + 1) {
                end = array[i];
            } else {//หากไม่มีต่อแล้ว
                if (start == end) { //หากวันออกอากาศกับวันจบการออกอากาศเท่ากัน
                    result += start + ", ";
                } else {
                    result += start + "-" + end + ", ";
                }
                start = array[i];
                end = array[i];
            }//end else
        }//end loop

        //ไว้เช็คเวลาวันออกอากาศติดกันหลายวันจนหมด array เช่น 1-10
        if (start != end)
            result = result + start + "-" + end;

        return result;
    }
}