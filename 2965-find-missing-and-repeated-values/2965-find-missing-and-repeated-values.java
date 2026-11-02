class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
// n2 size array
int n =grid.length;
        int arr[]= new int[n*n];
 //store matrix
int k=0;
int duplicate=0;
int missing=0;
for(int i =0;i<grid.length;i++){
    for(int j=0;j<grid.length;j++)
{
    
       arr[k]=grid[i][j];
       k++;
    
}
}
 //sort
 Arrays.sort(arr);
 //curent==current+1 =duplicate
int curr;
 for(int i=0;i<arr.length-1;i++){
    curr=arr[i];
    if(arr[i]== arr[i+1]){
        duplicate=arr[i+1];
       
    }
     //current ele !=currentele+1 missing
   else  if(arr[i]+1 != arr[i+1]){

      missing = arr[i]+1;
       
       
    } 
    
   else {
          continue;
    }
    

        }
        if(arr[0]!=1){
            missing =1;
        }
     if(missing ==0){
        missing=arr[arr.length-1]+1;
      }
   
return new int[]{duplicate, missing};
    }
}