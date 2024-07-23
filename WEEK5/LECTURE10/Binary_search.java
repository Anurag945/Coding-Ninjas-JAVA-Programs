package WEEK5.LECTURE10;

public class Binary_search {

    public static int binary_Search(int[] nums ,int target){
      int start=0;
      int end = nums.length-1;
      int mid= (int)((start+end)/2);
        while(start<=end){
        if(nums[mid]==target){
        System.out.println(nums[mid]);
      }
      if( nums[mid]<target){
        start= mid+1;
      }
      else if(nums[mid]> target){
        
        end=mid-1;
      }
    }
    return -1;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,7,8,9,10,11};
        int index= binary_Search(nums, 5);
        System.out.println(index);

        
    }
    
}
