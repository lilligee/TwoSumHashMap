import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap{
    public static void main(String[] args){
        Solution mysol = new Solution();
        int answer[] = mysol.twoSum(new int[]{1,3,4,7},8);
        System.out.print(Arrays.toString(answer));
    }
}
/* My Initial Approach:
   - I was approaching this
     with comparing each index
     to the 0th, but quickly
     realized that it was inefficient.

   - The most efficient time complexity
     is to use a Map.

   - The logic of implementing
     this structure is bc it keeps a
     log of pointers to each index,
     and eventually breaks when the
     conditions are met.
     It doesn't have to iterate through
     the array multiple times!
     */

/* What I did wrong:
   - the logic was kinda muddy and indeterminate
   -  */
class MyTry{
    public int[] twoSum(int[] nums, int target){
        int catcher = 0; // initialize a catcher
        for(int i = 0; i < nums.length-1; i++){
            if(nums[0] + nums[nums.length-1] == target)
                catcher = i;
        }
        System.out.println(catcher);
        return nums;
    }
}
class Solution{
    public int[] twoSum(int[] nums, int target){
        //
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int curr = nums[i];
            // target = curr - x
            // x = target - curr
            int winningIndex = target - curr;
            if(map.containsKey(winningIndex)){
                // return a new array of ints,
                // with values of the winning 2 indices
                return new int[]{map.get(winningIndex),i}; // auto-boxes primitive

            }
            // if false/otherwise:
            // put the current index
            map.put(curr,i);
        }
        // to satisfy compiler requirement
        return null;
    }
}
class Solution2{
    public int maximumWealth(int[][] accounts){
        int max = 0;
        // iterate the length of the array
        for(int i = 0; i < accounts.length; i++){
            // to get each index
            for(int j = 0; i < accounts[i].length; j++){
                max = Math.max(j,i);
            }

        }
        return max;
    }
}