import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Max Number of K-Sum Pairs

You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.

Example 1:
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:
Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.
Constraints:
1 <= nums.length <= 105
1 <= nums[i] <= 109
1 <= k <= 109
*/
public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        // int i = 0;
        // int j = 0;
        // int counter = 0;
        // Set<Integer> seenItrs = new HashSet<Integer>();
        // int maxCounter = (int) Math.ceil((double) nums.length / 2);
        // while (i < nums.length && counter < maxCounter) {
        //     if (seenItrs.contains(i)) i++;
        //     j = 0;
        //     while (j < nums.length && counter < maxCounter) {
        //         if (seenItrs.contains(j)) j++;
        //         if (i != j 
        //         && (nums[i] + nums[j]) == k) {
        //             counter++;
        //             seenItrs.add(j);
        //             seenItrs.add(i);
        //             j = nums.length;
        //         } else {
        //             j++;
        //         }
        //     }
        //     i++;
        // }
        // return counter;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res) == 1) map.remove(res);
                else map.put(res, map.get(res) - 1);
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}
