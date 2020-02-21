class Solution {
    //while if循环有&& ||时，会先判断前面的。当同时处理边界条件时，要将边界条件放在前面
    public int[] exchange(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int temp=0;
        while(left<right){
            while(left<nums.length&&nums[left]%2==1){
                left++;
            }
            while(right>=0&&nums[right]%2==0){
                right--;
            }
            if(left>=right){
                break;
            }
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }
        return nums;
    }
}