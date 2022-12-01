package ss19_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validate_phone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String REGEX_PHONE_NUMBER = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        Pattern p = Pattern.compile(REGEX_PHONE_NUMBER);
        while (true){
            System.out.println("Enter phone number: ");
            String phoneNumber = sc.nextLine();

            if (p.matcher(phoneNumber).find()){
                System.out.println("Matched phone number!");
                break;
            }else {
                System.err.println("Unmatched phone number!");
            }
        }
    }
}
