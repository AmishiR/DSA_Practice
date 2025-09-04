class Solution {
    public String smallestPalindrome(String s) {
        int[] ct = new int[26];
        for(char ch: s.toCharArray()) ct[ch-'a']++;
        
        int n = s.length(), j = 0;
        char[] arr = new char[n];
        for(int i=0; i<26; i++) {
            char ch = (char)(i+'a');
            while(ct[i] > 1) {
                arr[j] = arr[n-j-1] = ch;
                ct[i] -= 2;
                j++;
            }
        }
        
        if(n%2 != 0) {
            arr[j] = s.charAt(n/2);
        }
        
        return new String(arr);
    }
}