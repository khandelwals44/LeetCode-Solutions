class Solution {
    public double myPow(double x, int n) {
    //     double sum = x;
    //     if(n==0) return 1;
    //     else if(n>0) return power(sum,x,n);
    //     else return negativePower(1/sum,1/x,n);
    // }
    // double power(double sum, double x, int n){
    //     if(n<=1)
    //         return sum;
    //     return power(sum*x,x,n-1);
    // }
    // double negativePower(double sum, double x, int n){
    //     if(n==1)
    //         return sum;
    //     return power(sum*x,x,n-1);
    // }
        return Math.pow(x,n);
}
}