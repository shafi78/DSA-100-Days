import java.util.ArrayList;

public class S_13_container_with_most_water_2_pointer_approach {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0 ;
        int lp = 0 ;
        int rp = height.size()-1 ;

        while (lp < rp) {
            // calculate water area

            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp ;
            int currWater = ht*width ;
            maxWater = Math.max(maxWater, currWater);

            // update ptr

            if (height.get(lp) < height.get(rp)) {
                lp++ ;
            }

            else {
                rp-- ;
            }
        }
        return maxWater ;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);

        System.out.println(storeWater(height));
    }
}


// Time complexity : 40