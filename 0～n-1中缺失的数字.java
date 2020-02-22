class Solution {
    //   /会向下取整
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(nums[mid]!=mid) {
                if(mid==0 || mid > 0 && nums[mid-1]==mid-1)
                    return mid;
                right=mid-1;
            }else {//如果下标和数字相同就在右边查找
                left=mid+1;
            }
        }
        //到这一步，说明前面数字都不缺了，那只能是少最后一个数
        return nums.length;
    }
}