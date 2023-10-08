import java.util.ArrayList;
import java.util.List;

/*

Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "hello"
Output: "holle"
Example 2:
Input: s = "leetcode"
Output: "leotcede"

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
public class Solution345 {
    public static String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        // Map<Integer, Character> vvowels = new HashMap<>();
        var result = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            var curChar = s.charAt(i);
            var isVowel = isVowel(curChar);
            if (isVowel) {
                vowels.add(curChar);
                // vvowels.put(i, curChar);
            }
        }
        var counter = 0;
        for (int i = s.length() - 1; i <= 0; i--) {
            var curChar = s.charAt(i);
            var isVowel = isVowel(curChar);
            if (isVowel) {
                // result.replace(i, i + 1, vowels.get(counter++).toString());
                result.setCharAt(i, vowels.get(counter++));
            }
        }
        return result.toString();
    }

    private static boolean isVowel(Character v1) {
        var v = v1.toString().toLowerCase();
        return v.equals("a") || v.equals("e")
        || v.equals("i") || v.equals("o") || v.equals("u");
    }

    public static void main(String[] args) {
        String test = "hello";
        System.out.println(reverseVowels(test));
    }
}
