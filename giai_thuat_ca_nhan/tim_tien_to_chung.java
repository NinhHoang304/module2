package giai_thuat_ca_nhan;

public class tim_tien_to_chung {
    public static void main(String[] args) {

        String[] array = {"flower", "flow", "flight"};
        String str = "";

        for (int i = 0; i < array.length; i++) {
            if (array[0].charAt(i) == array[1].charAt(i)) {
                if (array[1].charAt(i) == array[2].charAt(i)) {
                    str += array[0].charAt(i);
                }
            }
        }

        System.out.println(str);
    }
}
