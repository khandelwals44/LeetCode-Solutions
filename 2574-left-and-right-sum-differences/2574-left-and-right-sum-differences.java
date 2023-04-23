class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        
        for(int i = 1; i<=n-1; i++){
            leftSum[0] = 0;
            leftSum[i]=nums[i-1]+leftSum[i-1];
        }
        for(int i = n-2; i>=0; i--){
            rightSum[n-1] = 0;
            rightSum[i]=nums[i+1]+rightSum[i+1];
        }
        for(int i = 0; i<n; i++){
            
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}