class Solution {
    public int reverse(int x) {
         int sum=0;
        while(x!=0){
            int n=x%10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && n> 7)) {
                return 0; // overflow
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && n < -8)) {
                return 0; // underflow
            }
            sum=sum*10+n;
            x=x/10;
        }return sum;
    }
}