class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int temp = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}