class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int zerocount=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==0){
                zerocount++;
            }

            if(zerocount>k){

                if(nums[left]==0){
                    zerocount--;
                }

                left++;
            }
            i++;
        }
        return i-left;
        
    }
}