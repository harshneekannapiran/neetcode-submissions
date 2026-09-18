class Solution {
    public int characterReplacement(String s, int k) {
        int[] charcount=new int[26];
        int maxcount=0;
        int maxlength=0;
        int left=0;
       
        for(int right=0;right<s.length();right++){
            charcount[s.charAt(right)-'A']++;
            int currcount=charcount[s.charAt(right)-'A'];
            maxcount=Math.max(maxcount,currcount);

            if(right-left+1-maxcount>k){
            charcount[s.charAt(left)-'A']--;
            left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
