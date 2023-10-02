
class Solution1 {
    class SolutionInner {
        public String mergeAlternately(String word1, String word2) {
            if (word1.isBlank()) return word2;
            if (word2.isBlank()) return word1;
            StringBuilder result = new StringBuilder();
            if (word1.length() <= word2.length()) {
                for (int i = 0; i <= word1.length(); i++) {
                    result.append(word1.charAt(i));
                    result.append(word2.charAt(i));
                }
                if (word1.length() < word2.length()) {
                    result.append(word2.substring(word1.length()));
                }
            } else {//if (word1.length() > word2.length())
                for (int i = 0; i < word2.length(); i++) {
                    result.append(word1.charAt(i));
                    result.append(word2.charAt(i));
                }
                result.append(word1.substring(word2.length()));
            }
            
            return result.toString();
        }
    }

    public static void main(String[] args) {
        
    }
}