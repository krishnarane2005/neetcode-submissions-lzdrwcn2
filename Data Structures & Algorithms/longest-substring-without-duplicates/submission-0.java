class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            if(mp.containsKey(c)){
                left = Math.max(left,mp.get(c)+1);
            }
            mp.put(c,right);
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
