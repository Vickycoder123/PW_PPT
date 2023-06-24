package Assignment1;

import java.util.Arrays;
import java.util.HashMap;

//TimeComplexity: O(N)
//SpaceComplexity: O(N)
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int []result = new int[2];

        HashMap<Integer,Integer> hm = new HashMap<>();

        //putting nums[i] as key and indices as value in Map
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            //case1: if currentElement and target are equal means nums[] contains 0 as another element
            if(nums[i] == target && hm.containsKey(0)){
                result[0] = i;
                result[1] = hm.get(0);
                break;
            }
            //case2: Elements are non-repeatable
            else if(hm.containsKey(target - nums[i])){
                if(hm.get(target - nums[i]) > i){
                    result[0] = i;
                    result[1] = hm.get(target - nums[i]);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,0};
        int target = 11;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}