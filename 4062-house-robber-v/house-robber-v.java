class Solution {
    public long rob(int[] nums, int[] colors) {
        long[] dp=new long[nums.length];
        Arrays.fill(dp,-1);
        helper(nums, colors,0,dp);
        return dp[0];
    }
    public long helper(int[] nums , int [] colors , int i , long[] dp){
        if(i>=nums.length) return 0L;
        if(dp[i]!=-1) return dp[i];
        long take=0;
        long nottake=0;
        if(i<nums.length-1 && colors[i]==colors[i+1]){
            take=nums[i]+helper(nums,colors,i+2,dp);
        }
        else{
            take=nums[i]+helper(nums,colors,i+1,dp);
        }
        nottake=helper(nums,colors,i+1,dp);
        return dp[i]=Math.max(take,nottake);
    }
}