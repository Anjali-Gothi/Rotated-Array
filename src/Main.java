

		class Solution {
		    public void rotate(int[] nums, int k) {
		        k%=nums.length;
		        reverse(nums,0,nums.length-1);
		        reverse(nums,0,k-1);
		        reverse(nums,k,nums.length-1);
		        
		        }
		    public void reverse(int[] nums,int l,int r){
		        while(l<r){
		        int temp=nums[l];
		        nums[l]=nums[r];
		        nums[r]=temp;
		        l++;
		        r--;
		    }
		    }
		    public static void main(String[] args) {
		    	int nums[]=new int[] {1,2,3,4,5,6};
		    	Solution s=new Solution();
		    	s.rotate(nums,3);
		    }
	}
