class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0, right = 1, index = 0;

        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left = right;
                index++;
                nums[index] = nums[left];
            }
            right++;
        }

        return index + 1;
    }
}