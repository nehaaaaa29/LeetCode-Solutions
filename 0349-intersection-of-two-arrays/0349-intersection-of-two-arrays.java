class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
      HashSet<Integer>set=new HashSet<>();
       HashSet<Integer>unique=new HashSet<>();
      for(int i=0;i<nums2.length;i++){
        set.add(nums2[i]);
      }
      for(int j=0;j<nums1.length;j++){
        if(set.contains(nums1[j])){
            unique.add(nums1[j]);
        }
         }
        int[]arr=new int[unique.size()];
        int index=0;
       for(Integer k:unique){
        arr[index]=k;
        index++;
       } 
        return arr;

    
    }
}