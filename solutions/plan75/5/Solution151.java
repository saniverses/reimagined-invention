public class Solution151 {
    public String reverseWords(String s) {
        StringBuilder ss = new StringBuilder(s.length());
        String[] splitted = s.trim().split("\\s+");
        for (int i = splitted.length - 1; i > 0; i--) {
            ss.append(splitted[i] + " ");
        }
        return splitted.toString().trim();
    }
}
