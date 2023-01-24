import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        //intro
        System.out.println("< INTERSECTION FINDER >");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-");
        //scanner
        Scanner scanner = new Scanner(System.in);
        //first array
        System.out.println("_FIRST ARRAY_");
        System.out.println("Please enter length of the first array:");
        int[] firstArray = new int[scanner.nextInt()] ;
        System.out.println("Please enter numbers for the array:");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scanner.nextInt();
        }
        System.out.println("------------------------");
        //second array
        System.out.println("_SECOND ARRAY_");
        System.out.println("Please enter length of the second array:");
        int[] secondArray = new int[scanner.nextInt()];
        System.out.println("Please enter numbers for the array:");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = scanner.nextInt();
        }
        //we need arrayList to get a dynamic array
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i : firstArray) {
            for (int j : secondArray) {
                if (i == j)
                    arrayList.add(i);
            }
        }
        System.out.println("------------------------");
        System.out.println("The result is: "+arrayList);
    }
}
