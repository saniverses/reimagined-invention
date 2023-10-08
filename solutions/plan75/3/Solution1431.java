import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = getMax(candies);
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            var candiesWithExtra = candies[i] + extraCandies;
            if (candiesWithExtra > max) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }
        return result;
    }

    private int getMax(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }
        return max;
    }
}
