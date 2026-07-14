class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i =0;
        int k=0;
        int temp=0;
        while(i<nums.length){
            if( nums[i]%2==0){
                temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;

            }
            i++;
        }
        return nums;
    }
}