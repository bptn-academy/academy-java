package com.bptn.challenges;

public class InsertPosition {
/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 */
	public static int searchInsert(int[] nums, int target) {
        // Write your code here
		//to start, I'll go through an array to find target - will use for loop for this
		//if target is found, print the index - if/else statements contained within for loop
		// else arrange number in array - if/else statements contained within for loop
		// if target is less than number at index.return that first index of the number it is less than.
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} 
			if (target < nums[i]){
				return i ;
			}
       }
		return nums.length;
	}

    // Do not modify the code below
    public static void main(String args[]){
        int nums[] = {1, 3, 5, 7, 9} , target = 9;
        int nums1[] = {1, 3, 5, 6} , target1 = 3;
        int nums2[] = {1, 3, 5, 6, 7} , target2 = 7;

        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));

    }

}
