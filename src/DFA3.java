import java.util.Scanner;

public class DFA3 {

    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);
        //start
        System.out.print("Enter a text starts with 1: ");
        //getting input
        int a=0;
        while(a<1){
            String text = scanner.next();
            q0(text, 0);
        }


    }

    static void q0(String text, int i) {
        if (text.length() == i) {
            System.out.println("Not accept");
            return;
        }

        if (text.charAt(i) == '0') {
            q2(text, i + 1);
        } else {
            q1(text, i + 1);
        }

    }

    static void q1(String text, int i) {
        if (text.length() == i) {
            System.out.println("Accept");
            return;
        }
        q1(text, i + 1);
    }

    static void q2(String text, int i) {
        if (text.length() == i) {
            System.out.println("Not accept");
            return;
        }
        q2(text, i + 1);
    }


}




