import java.util.Scanner;

public class MealyMachine {
    //print a after 01
    static String output = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        while (!scanner.hasNext("[0-1]+")) {
            System.err.println("wrong input!(Enter only 0 & 1)");
            System.out.println();
            System.out.print("Enter text: ");
            scanner.next();
        }
        String text = scanner.next();
        q0(text, 0);

    }

    static void q0(String text, int i) {
        if (text.length() == i) {
            System.out.println(output);
            return;
        }
        if (text.charAt(i) == '0') {
            output += 'b';
            q1(text, i + 1);
        } else {
            output += 'b';
            q0(text, i + 1);
        }
    }

    static void q1(String text, int i) {
        if (text.length() == i) {
            System.out.println(output);
            return;
        }
        if (text.charAt(i) == '0') {
            output += 'b';
            q1(text, i + 1);
        } else {
            output += 'a';
            q2(text, i + 1);
        }
    }

    static void q2(String text, int i) {
        if (text.length() == i) {
            System.out.println(output);
            return;
        }
        if (text.charAt(i) == '0') {
            output += 'b';
            q1(text, i + 1);
        } else {
            output += 'b';
            q0(text, i + 1);
        }
    }

}
