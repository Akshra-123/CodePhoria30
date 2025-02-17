class Solution {
    public int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length) {
            int check = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[check]) {
                int temp = nums[i];
                nums[i] = nums[check];
                nums[check] = temp;
            } else {
                i++;
            }
        }

        for (i=0;i<nums.length;i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
