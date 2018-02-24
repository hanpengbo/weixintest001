package com.hpb.weixintest001.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hpb on 2018-02-23.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int dup = nums[0];
        int end = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=dup){
                nums[end] = nums[i];
                dup = nums[i];
                end++;
            }
        }
        return end;
    }
    public static void main(String[] args) {
       int a[] = {1,1,1,1,2};
       RemoveDuplicates r = new RemoveDuplicates();
       r.removeDuplicates(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
