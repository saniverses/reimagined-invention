public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty() && !s.isEmpty()) return false;
        
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(0)) {
                if (s.length() == 1) return true;
                var subS = s.substring(1);
                var subT = t.substring(i + 1);
                return isSubsequence(subS, subT);
            }
        }
        return false;
    }
}
