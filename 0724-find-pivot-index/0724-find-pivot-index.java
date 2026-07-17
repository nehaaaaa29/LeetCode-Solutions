class Solution {
    public int pivotIndex(int[] nums) {
       
       
         int i=0;
       
    
        
      while(i<nums.length){
        int pivot=i;
          int k=0;
           int leftsum=0;
        while(k<i){
            leftsum=leftsum+nums[k];
        k++;
        }
          int rightsum=0;
            int j=i+1;
         while(j<nums.length){
        
        rightsum=rightsum+nums[j];
        j++;
       }


       if(leftsum==rightsum){
        return pivot;
       } 
    
         i++;
      }

        return -1;
      
       
    }
}