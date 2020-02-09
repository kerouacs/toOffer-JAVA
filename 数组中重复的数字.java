方法1：排序
import java.util.*;
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length == 0){
            return false;
        }
        Arrays.sort(numbers);
        for(int i=0;i<length-1;i++){
            if(numbers[i] == numbers[i+1]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}

方法2：哈希表

import java.util.*;
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        Set<Integer> set = new HashSet<>();
        for(int i =0 ;i<length;i++){
            if(set.contains(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }else{
                set.add(numbers[i]);
            }             
        }
        return false;
    }
}   

方法3：


import java.util.*;
public class Solution {
    public boolean duplicate(int nums[],int length,int [] duplication) {
        if(nums == null || length == 0){
            return false;
        }
        for(int i=0;i<length;i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    duplication[0] = nums[i];
                    return true;
                }
                // swap
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return false;
    }
}