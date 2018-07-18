public class Solution {
    public int search(int[] nums, int target) {
      
        return binarySearch(nums,0,nums.length-1,target);
    }
    public int binarySearch(int[] nums,int l,int r,int target){
        if(r>=l){
            int mid=l+(r-l)/2;
        if(nums[mid]==target)
            return mid;
        else if(target<nums[mid]){
            return binarySearch(nums,l,mid-1,target);
            
        }
       
           return binarySearch(nums,mid+1,r,target);

        }
        return -1;
    }
    
    public static void main(String args[]){
    Solution obj=new Solution();
      int[] nums = new int[6]{0,1,2,3,4,5};
      int target = 4;
      int result = obj.search(nums,0,nums.length-1,target);
      if(result==-1){
      System.out.println("No such element found");
      }
      else  
        System.out.println("Element found at "+result+" index");
      
}
