package ss19_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validate_name_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String REGEX_CLASS_NAME = "^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
        Pattern p = Pattern.compile(REGEX_CLASS_NAME);
        while (true){
            System.out.println("Enter class name : ");
            String phoneNumber = sc.nextLine();

            if (p.matcher(phoneNumber).find()){
                System.out.println("Matched class name !");
                break;
            }else {
                System.err.println("Unmatched class name !");
            }
        }
    }
}
