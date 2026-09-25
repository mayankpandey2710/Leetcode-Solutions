class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex=0;
        int negativeIndex=1;
            int[] result = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            result[positiveIndex]=nums[i];
            positiveIndex+=2;
        }
        else{
            result[negativeIndex]=nums[i];
            negativeIndex+=2;
        }
       }
   return result;  }
    }