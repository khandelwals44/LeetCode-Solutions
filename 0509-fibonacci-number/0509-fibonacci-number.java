// Solution Using Dynamic Programming
// Using Memoization (Top-Down)
class Solution {
    public int fib(int N) {
        //Define an array of length N+1 for storing each f(N) and initalize all index with -1
        int[] dp = new int[N+1];
        Arrays.fill(dp,-1);
        //Call the recursive f(N)
        return(fn(N,dp));
    }

    int fn(int N, int dp[]){
        //When we reach f(N) = 1, return 1
        if(N<=1)
            return N;
        // if(f(N) is not stored in memory, sotre it by updating the array index i.e dp[N])
        if(dp[N]!=-1)
            return dp[N];
        // finally return the f(N) and store it in dp[N]
        return dp[N] = fn(N-1,dp)+fn(N-2,dp);            
    }
}

// T.C = 