import java.util.Scanner;

public class HomeWork1B {
    public static void main(String[] args) {
        //Design a system that includes "the"
        Scanner scanner = new Scanner(System.in);
        String word= scanner.next();
        q0(word,0);
    }

    static void q0(String word, int i) {
        if (word.length()==i){
            System.out.println("Not accepted!");
            return;
        }
        if (word.charAt(i)=='t'){
            q1(word, i+1);
        } else if (word.charAt(i)>='a' && word.charAt(i)<='z') {
            q0(word,i+1);
        }else {
            System.err.println("wrong input!");
        }
    }

    static void q1(String word, int i) {
        if (word.length()==i){
            System.out.println("Not accepted!");
            return;
        }
        if (word.charAt(i)=='t'){
            q1(word, i+1);
        } else if (word.charAt(i)>='h') {
            q2(word,i+1);
        } else if (word.charAt(i)>='a' && word.charAt(i)<='z') {
            q0(word,i+1);
        }else {
            System.err.println("wrong input!");
        }
    }

    static void q2(String word, int i) {
        if (word.length()==i){
            System.out.println("Not accepted!");
            return;
        }
        if (word.charAt(i)=='t'){
            q1(word, i+1);
        } else if (word.charAt(i)>='e') {
            q3(word,i+1);
        } else if (word.charAt(i)>='a' && word.charAt(i)<='z') {
            q0(word,i+1);
        }else {
            System.err.println("wrong input!");
        }
    }

    static void q3(String word, int i) {
        if (word.length()==i){
            System.out.println("Accepted ^-^");
        } else if (word.charAt(i)>='a' && word.charAt(i)<='z') {
            q3(word,i+1);
        }else {
            System.err.println("wrong input!");
        }
    }

}
