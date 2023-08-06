class Solution {
    public String largestNumber(int[] nums) {
        String[] c = new String[nums.length];
        for(int i = 0;i<nums.length;i++){
            c[i] = Integer.toString(nums[i]);
        }
        StringBuilder ans = new StringBuilder();
        Arrays.sort(c,(a,b)->(b+a).compareTo(a+b));
//         {
//             String ab = a+""+b;
//             String ba = b+""+a;
            
//             if(Long.parseLong(ba)>Long.parseLong(ab))
//                 return 1;
//             return -1;
//         });
        
        for(int i = 0;i<c.length;i++){
            ans.append(c[i]);
        }
        if(ans.charAt(0)=='0') return "0";
        return ans.toString();
    }
}