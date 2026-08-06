class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int c = 0;
        for(int i = 0; i <= s.length()-2; i++) {
            c = Math.abs(s.charAt(i+1)-s.charAt(i));
            sum += c;
        }
        return sum;
    }
}