class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


Arrays.sort(nums);
 
 int n= nums.length;
  int j=0;
  int k=0;

   List<List<Integer>>list=new ArrayList<>();


   for( int i=0;i<n-2;i++){
    if(i>0 && nums[i]==nums[i-1]){
        continue;
    }
    j=i+1;
    k=n-1;

     while(j<k){

        int res=nums[i]+nums[j]+nums[k];

        if(res==0){
            ArrayList<Integer>s=new ArrayList<>();
            s.add(nums[i]);
            s.add(nums[j]);
            s.add(nums[k]);
            list.add(s);
            while(j<k && nums[j]== nums[j+1]){
                j++;
            }
             while(j<k && nums[k]== nums[k-1]){
                k--;
            }
            j++;
            k--;
        }
       
        else if(res>0){
            k--;
        }
         else {
            j++;
        }
    
   }

   }
  

     return list;   
    }
}  
    