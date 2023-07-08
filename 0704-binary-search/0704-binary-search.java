class Solution {
    public int search(int[] nums, int target) {
            
        int n = nums.length;
        int low = 0;
        int hi = n-1;
        
        while(low<=hi){
            int mid = (low+hi)/2;
            
            if(nums[mid] == target) return mid;
            
            else if(nums[mid]<target) low = mid+1;
            
            else hi = mid-1;
        }
        
        return -1;
        
    }
}