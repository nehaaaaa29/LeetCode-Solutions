class Solution {
    public void moveZeroes(int[] nums) {
      int i=0;
      int j=0;
      int k=nums.length-1;
      while(j<=k){
      
        if(nums[j]!=0 ){

           int temp=nums[j];
           nums[j]=nums[i];
           nums[i]=temp; 
           i++;
           j++;
        }
        
        else{
           
            j++;
        }
        

      
    }
}
}