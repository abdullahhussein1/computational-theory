import java.util.ArrayList;

public class Difference {

    public static void main(String[] args) {

        int[] setA = {1,2,4};
        int[] setB = {3,4,5,6};
        //creating array for difference between set A & set B
        ArrayList<Integer> diff = new ArrayList<>();
        boolean isSame = false;
        for (int i : setA){
            for (int j : setB){
               if (i==j){
                   isSame=true;
                   break;
               }
            }
            if (!isSame){
                diff.add(i);
            }
            isSame=false;
        }

        System.out.println(diff);


    }

}
