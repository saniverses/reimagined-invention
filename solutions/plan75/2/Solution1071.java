class Solution1071 {

    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) { 
            return gcdOfStrings(str2, str1); 
        } else if (!str1.startsWith(str2)) { 
            return ""; 
        } else if (str2.isEmpty()) {
            return str1;
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2); 
        }
    }

 

    public static void main(String[] args) {

        String str1 = "ABCABCABC";

        String str2 = "ABC";

        var result = gcdOfStrings(str1, str2);

        System.out.println(result);

    }

}

 

