class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for(int n:nums){
            if(sum<0){
                sum=n;
            }else{
                sum+=n;
            }
            res=Math.max(sum,res);
        }
        return res;
    }
}