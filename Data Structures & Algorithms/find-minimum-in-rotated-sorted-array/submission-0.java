class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            if (nums[l] <= nums[r]) return nums[l];
            int mid = l + (r-l) / 2;
            if (mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];
            if (nums[l] > nums[mid]) r=mid-1;
            else l = mid+1;
        }
        return -1;
    }
}
