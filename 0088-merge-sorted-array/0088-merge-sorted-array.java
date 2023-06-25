class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] result = new int[m+n];
        
//         int p1=1,p2=0,p3=0;
//         while(p1<m && p2<n){
//             if(nums1[p1]<=nums2[p2]){
//                 result[p3]= nums1[p1];
//                 p1++;
//                 p3++;
//             }else{
//                 result[p3]= nums2[p2];
//                 p2++;p3++;
//             }
//         }
//         while(p1<m){
//             result[p3]= nums1[p1];
//             p3++;
//             p1++;
//         }
//         while(p2<n){
//             result[p3]= nums1[p2];
//             p3++;
//             p2++;
//         }
//         for(int i =0;i<m+n;i++){
//             System.out.println("nums1[i] = " + result[i]);
//         }
//         for(int i =0;i<m+n;i++){
//             nums1[i]=result[i];
//         }
        int p1 = m-1; int p2 = n-1; int i = m+n-1;
        
        while(p2>=0){
        if(p1>=0 && nums1[p1]>nums2[p2]){
            nums1[i--] = nums1[p1--];
        }
        else{
            nums1[i--] = nums2[p2--];
        }
    }
    }
}