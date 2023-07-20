class ClimbingStairs {
    //Fibonacci
    public int climbStairs(int n) {
        int n1 = 1, n2 = 1, temp = 0;
        for(int i = 1; i< n; i++) {
            temp = n1;
            n1 = n1 + n2;
            n2 = temp;
        }
        return n1;
    }
}


/**
 *  Memoization / Caching
 class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
*/