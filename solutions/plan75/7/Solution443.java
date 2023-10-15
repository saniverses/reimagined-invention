import java.util.Arrays;

/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead,
be stored in the input character array chars. Note that group lengths that are 10 or longer
will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Example 2:
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
Example 1:
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Constraints:
1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
 */
public class Solution443 {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        int localCounter = 1;
        int allCounter = 1;
        int curIter = 0;
        char previousChar = chars[0]; 
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == previousChar) {
                localCounter++;
                allCounter++;
            } else {
                if (localCounter > 1 && localCounter < 10) {
                    chars[curIter + 1] = (char) (localCounter + '0');
                } else if (localCounter >= 10 && localCounter < 100) {
                    chars[curIter + 1] = (char) (localCounter + '0');
                    chars[curIter + 2] = (char) (localCounter % 10 + '0');
                } else if (localCounter >= 100 && localCounter < 1000) {
                    chars[curIter + 1] = (char) (localCounter + '0');
                    chars[curIter + 2] = (char) (localCounter % 10 + '0');
                    chars[curIter + 3] = (char) (localCounter % 100 + '0');
                } else if (localCounter >= 1000 && localCounter <= 2000) {
                    chars[curIter + 1] = (char) (localCounter + '0');
                    chars[curIter + 2] = (char) (localCounter % 10 + '0');
                    chars[curIter + 3] = (char) (localCounter % 100 + '0');
                    chars[curIter + 4] = (char) (localCounter % 1000 + '0');
                }
                curIter = i;
                previousChar = chars[i];
                localCounter = 1;
                allCounter++;
            }
        }
        if (localCounter > 1 && localCounter < 10) {
            chars[curIter + 1] = (char) (localCounter + '0');
            chars = Arrays.copyOf(chars, curIter + 1);
        } else if (localCounter >= 10 && localCounter < 100) {
            chars[curIter + 1] = (char) (localCounter + '0');
            chars[curIter + 2] = (char) (localCounter % 10 + '0');
            chars = Arrays.copyOf(chars, curIter + 2);
        } else if (localCounter >= 100 && localCounter < 1000) {
            chars[curIter + 1] = (char) (localCounter + '0');
            chars[curIter + 2] = (char) (localCounter % 10 + '0');
            chars[curIter + 3] = (char) (localCounter % 100 + '0');
            chars = Arrays.copyOf(chars, curIter + 3);
        } else if (localCounter >= 1000 && localCounter <= 2000) {
            chars[curIter + 1] = (char) (localCounter + '0');
            chars[curIter + 2] = (char) (localCounter % 10 + '0');
            chars[curIter + 3] = (char) (localCounter % 100 + '0');
            chars[curIter + 4] = (char) (localCounter % 1000 + '0');
            chars = Arrays.copyOf(chars, curIter + 4);
        }
        return allCounter;
    }
}
