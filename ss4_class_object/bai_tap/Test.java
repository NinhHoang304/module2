package ss4_class_object.bai_tap;

public class Test {
    public static void main(String[] args) {
        int[] array = {8, 7, 2, 5, 3, 1};
        int x = 10;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((array[i] + array[j] == x)) {
                    System.out.println("[" + array[i] + "," + array[j] + "]");
                }
            }
        }
    }
}
