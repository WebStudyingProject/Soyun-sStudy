package Recursion_2;
/*Recursion-2 > groupSum
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target?
This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem,
you can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array,
our convention is to consider the part of the array starting at index start and continuing to the end of the array.
The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
Hint:
The base case is when start>=nums.length. In that case, return true if target==0. Otherwise, consider the element at nums[start].
The key idea is that there are only 2 possibilities -- nums[start] is chosen or it is not.
Make one recursive call to see if a solution is possible if nums[start] is chosen (subtract nums[start] from target in that call).
Make another recursive call to see if a solution is possible if nums[start] is not chosen.
Return true if either of the two recursive calls returns true.
groupSum(0, [2, 4, 8], 10) �� true
groupSum(0, [2, 4, 8], 14) �� true
groupSum(0, [2, 4, 8], 9) �� false*/
public class a1_groupSum {
	public boolean groupSum(int start, int[] nums, int target) {
		  if(nums.length<start)return false;
		  int sum=0;
		  if(nums.length>start){
		    sum=nums[start]+nums[start+1];
		    if(sum==target)return true;
		  }
		  else{
		    return false;
		  }
		  return groupSum(start+1,nums,target);
		  /*
		    if(target==0) return true;
		    else if(start==nums.length)return false;
		    else{
		      return groupSum(start+1, nums, target-nums[start])
		        || groupSum(start+1, nums, target);
		    }
		  */
		}
	
	// Solution
	public boolean sgroupSum(int start, int[] nums, int target) {
		  // Base case: if there are no numbers left, then there is a
		  // solution only if target is 0.
		  if (start >= nums.length) return (target == 0);
		  
		  // Key idea: nums[start] is chosen or it is not.
		  // Deal with nums[start], letting recursion
		  // deal with all the rest of the array.
		  
		  // Recursive call trying the case that nums[start] is chosen --
		  // subtract it from target in the call.
		  if (groupSum(start + 1, nums, target - nums[start])) return true;
		  
		  // Recursive call trying the case that nums[start] is not chosen.
		  if (groupSum(start + 1, nums, target)) return true;
		  
		  // If neither of the above worked, it's not possible.
		  return false;
		}
	
    public boolean ssgroupSum(int start, int[] nums, int target) {
        if (start >= nums.length && target == 0) return true;
        if (start < nums.length && groupSum(start + 1, nums, target - nums[start])) return true;
        if (start < nums.length && groupSum(start + 1, nums, target)) return true;
        return false;
    }
}
