class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 || haystack.length() == 0 || needle.length() > haystack.length()) return -1;
        int wordLen = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() <= haystack.length() && haystack.substring(i, i + needle.length()).equals(needle)) return i;
            }
        
        }
        return -1;
    }
}