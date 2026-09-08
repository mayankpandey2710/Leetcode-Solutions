class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index of each ASCII character
        int[] lastSeen = new int[128];
        
        // Initialize with -1 to indicate characters haven't been seen yet
        java.util.Arrays.fill(lastSeen, -1);
        
        int maxLength = 0;
        int left = 0; // Left pointer of our sliding window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character was seen and is inside our current window, 
            // move the left pointer past its previous occurrence
            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }
            
           
            lastSeen[currentChar] = right;
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}