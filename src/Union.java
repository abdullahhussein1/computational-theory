import java.util.ArrayList;

public class Union {

    public static void main(String[] args) {

        int[] setA = {1,2,3,4};
        int[] setB = {3,4,5,6};

        ArrayList<Integer> union = new ArrayList<>();
        for (int i:setA) {
            union.add(i);
        }
        boolean isSame=false;
        for (int j : setB) {
            for (int i : setA) {
                if (j==i){
                    isSame=true;
                    break;
                }
            }
            if (!isSame){
                union.add(j);
            }
            isSame=false;
        }

        System.out.println(union);


    }

}
