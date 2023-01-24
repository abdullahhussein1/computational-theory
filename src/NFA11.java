import java.util.Scanner;

public class NFA11 {

    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);
        //start
        System.out.print("Enter a text ends with 00: ");
        //getting input
            String text = scanner.next();
            System.out.println(q0(text, 0));

    }

    static boolean q0(String text, int i) {
        if (text.length() == i) {
            return false;
        }
        //dynamic
        if (text.charAt(i) == '1') {
            return q1(text, i + 1);
        }

        return false;
    }
    static boolean q1(String text, int i) {
        if (text.length() == i) {
            return false;
        }
        //dynamic
        if (text.charAt(i) == '0') {
            return q1(text, i + 1) || q2(text, i + 1);
        }

        return false;
    }



    static boolean q2(String text, int i) {
        if (text.length() == i) {
            return true;
        }
        return false;
    }

}