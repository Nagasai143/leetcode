class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int orginal=x;
        int sum=0;
        while(x>0){
            int t=x%10;
            sum=sum*10+t;
            x=x/10;
        }
        return orginal ==sum;
       
    }
}