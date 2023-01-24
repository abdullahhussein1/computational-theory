import java.util.Scanner;

public class NFA3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("<Ends with zero>");
        System.out.print("input String(contains 0 & 1):");

        while(!scanner.hasNext("[0-1]+")){
            System.err.println("wrong input!");
            System.out.println();
            System.out.print("Input string:");
            scanner.next();
        }

        String string = scanner.next();
        if (q0(string, 0)){
            System.out.println("Accepted");
        }else{
            System.err.println("Not accepted!");
        }

    }

    static boolean q0(String string ,int i){
        if (string.length()==i){
            return false;
        }

        if (string.charAt(i)=='0'){
            return (q0(string, i+1) || q1(string, i+1));
        }

        return q0(string, i+1);
    }

    static boolean q1(String string ,int i){
        if (string.length()==i){
            return true;
        }

        return false;
    }

}
