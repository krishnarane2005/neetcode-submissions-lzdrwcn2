class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder updated = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                updated.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = updated.length()-1;
        while (left < right) {
            if (updated.charAt(left) != updated.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
