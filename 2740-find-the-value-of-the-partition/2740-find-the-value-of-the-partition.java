class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int max = 0;
        int min = 0;
        for(int i = 0;i<nums.length-1; i++){
            if(nums[i+1]-nums[i]<diff){
                diff= nums[i+1]-nums[i];
                //max = nums[i+1];
                //min = nums[i-1];
                
            
        }
        }
        
            return diff;
        
        
    }
}