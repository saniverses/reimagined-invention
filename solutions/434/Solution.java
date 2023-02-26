class Solution {
    public boolean isSegment(String s) {
        if (s.length() == 0) return false;
        if (s.equals("")) return false;
        return true;
    }
    public int countSegments(String s) {
        if (s.length() == 0) return 0;
        if (s == " ") return 0;
        String[] words = s.split(" ");
        int count = 0;
        for (String str : words) {
            if (isSegment(str)) count++;
        }
        return count;
    }
}