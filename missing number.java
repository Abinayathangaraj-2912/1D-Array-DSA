class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a=n*(n+1)/2;
        int s=0;
        for(int b:nums){
            s+=b;
        }
        return a-s;
        
    }
}