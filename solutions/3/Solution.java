import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character,Integer> longest = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (longest.containsKey(s.charAt(i))) {}
            // var currentSizeOfLongestSet = longest.size();
            // longest.add(s.substring(i, i + 1));
            // if (longest.size() > currentSizeOfLongestSet) longest.clear();
        }
        return longest.size();
    }

    public static void main(String[] args) {
        
    }
}