import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumber = new ArrayList<>();
        int i =0;

        while(i<nums.length) {
            int check = nums[i]-1;
            if(nums[i] != nums[check]) {
                int temp = nums[i];
                nums[i] = nums[check];
                nums[check] = temp;
            } else {
                i++;
            }
        }

        for (i=0;i<nums.length;i++) {
            if(nums[i] != i+1) {
                missingNumber.add(i+1);
            }
        }
        return missingNumber;
    }
}
