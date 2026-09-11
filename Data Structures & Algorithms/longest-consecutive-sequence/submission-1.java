class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=1;
        if(nums.length==0) return 0;
        for(int num:nums){
            set.add(num);
        }

        for(int n:set){
            if(!set.contains(n-1)){
            int curr=n;
            int length=1;
            while(set.contains(curr+1)){
                curr++;
                length++;
            }
            max=Math.max(max,length);
            }
        }
        return max;
    }
}
