class Solution {
    public int subtractProductAndSum(int n) {
        int sod=0;
        int pod=1;
        while(n>0){
            int temp=n%10;
            sod=sod+temp;
            pod=pod*temp;
            n=n/10;
        }
        int result=pod-sod;
        return result;
        
    }
}