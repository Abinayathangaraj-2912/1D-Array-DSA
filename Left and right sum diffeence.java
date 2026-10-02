class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[]new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int l =0;
            int r=0;
            for(int j=0;j<nums.length;j++){
                l+=nums[j];

            }
            for(int j=0;j<nums.length;j++){
                r+=nums[j];
            }
        }
    }
}