package geeks.Array;

import com.math.Array_Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Leader {
    public static void main(String[] args) {
        int [] arr = {7,10,4,10,6,5,2};
        System.out.println(Arrays.toString(arr));

        System.out.println(leader(arr));
    }
    public static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int currentLeader = arr[arr.length-1];
        ans.add(0,currentLeader);
        for(int i =arr.length-2;i>=0;i--){
            if(currentLeader < arr[i]){
                ans.add(0,arr[i]);
                currentLeader= arr[i];
            }
        }

    return ans;
    }
}
