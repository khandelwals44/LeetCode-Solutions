class Solution {
    public int fib(int n) {
        //Using Recursion to solve the problem
        // calulcating the sum of each f(n) till we reach f(1);        
        if(n<=1)
            return n;        
        return fib(n-1)+ fib(n-2);      
    }
}
//T.C = O(2^n)
//S.C = O(1);
//better tc can be achieved by Dyanamic Programming.