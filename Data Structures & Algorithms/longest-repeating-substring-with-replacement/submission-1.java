class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int left=0;
        int right=0;
        int maxCount=0,maxLen=0;

        while(right<s.length()){
            hash[s.charAt(right)-'A']++;
            maxCount = Math.max(maxCount, hash[s.charAt(right)-'A']);
            while((right-left+1)-maxCount > k){
                hash[s.charAt(left)-'A']--;
                left++;
            }

            maxLen = Math.max(maxLen,(right-left+1));
            right++;
        }

        return maxLen;
    }
}
