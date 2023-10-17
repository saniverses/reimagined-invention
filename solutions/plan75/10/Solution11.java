/*
11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines
drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container,
such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < height.length && j >= 0 && i < j) {
            int yi = height[i];
            int yj = height[j];
            // int minY = y1 < y2 ? y1 : y2;
            int curWater = calculateWater(i, yi, j, yj);
            if (curWater > water) water = curWater;
            if (yi < yj) i++;
            else j--;
        }
        return water;
    }
    private int calculateWater(int x1, int y1, int x2, int y2) {
        if (y1 < y2) return (x2 - x1) * y1;
        else return (x2 - x1) * y2;
    }
}
