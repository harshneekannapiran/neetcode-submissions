class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[127];
        int left=0;
        int right=0;
        int minstart=0;
        int minlength=Integer.MAX_VALUE;
        int needed=t.length();
        if(t.length()>s.length())
            return "";

        for(char c:t.toCharArray()){
            freq[c]++;
        }
        while(right<s.length()){
            char r=s.charAt(right);

            if(freq[r]>0)
                needed--;
            freq[r]--;
            right++;

            while(needed==0){
                if((right-left)<minlength){
                    minlength=right-left;
                    minstart=left;
                }

                char l=s.charAt(left);
                freq[l]++;

                if(freq[l]>0)
                    needed++;
                left++;
            }
        }
        if(minlength==Integer.MAX_VALUE)
            return "";

        return s.substring(minstart,minstart+minlength);
    }
}
