class Solution {
    public int numWays(int n) {
        int first=1;
        int second=1;
        for(int i=0;i<n;i++){
            int sum=(first+second)%1000000007;
            first=second;
            second=sum;

        }
        return first;
    }
}