package CodingBat_Warmup2;
/*
 * 
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) �� true
has271([1, 2, 8, 1]) �� false
has271([2, 7, 1]) �� true
 */
public class b8_has271 {
	public boolean has2711(int[] nums) {
		  for(int i=0; i<nums.length-2; i++)
		  {
		    if(nums[i]==2&&nums[i+1]==7&&nums[i+2]==1)
		    return true;
		  }
		  return false;
	}
	
	// Solution
	public boolean has2712(int[] nums) {
		  // Iterate < length-2, so can use i+1 and i+2 in the loop.
		  // Return true immediately when seeing 271.
		  for (int i=0; i < (nums.length-2); i++) {
		    int val = nums[i];
		    if (nums[i+1] == (val+5) &&              // the "7" check
		      Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
		        return true;
		    }
		  }
		  
		  // If we get here ... none found.
		  return false;
	}
}
