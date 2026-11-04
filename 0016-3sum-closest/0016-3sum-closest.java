class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int max_diff = Integer.MAX_VALUE; 
       int result_sum=0;
      
      

       
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
           
        int j=i+1;
        int k=nums.length-1;
        
        while(j<k){
           int sum =nums[i]+ nums[j]+nums[k];
           int diff=Math.abs(sum-target);
           if(diff<max_diff){
            max_diff=diff;
            result_sum=sum;
           }
           if(sum==target){
            return sum;
           }
           else if(sum< target){
            j++;
           }
           else{
            k--;
           }
        }

        }

           return result_sum;

        
 }
}