class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int orginal=x;
        while(x>0){
            int t=x%10;
            sum=sum+t;
            x=x/10;
        }
        if(orginal%sum==0){
            return sum;
        }else{
            return -1;
        }
        
    }
}