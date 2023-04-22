class Solution {
    public int climbStairs(int n) {
        int a=1,b=1,res=1;
for(int i=1;i<n;i++){
res=(a+b);
a=b;
b=res;
}
return res;
}
}