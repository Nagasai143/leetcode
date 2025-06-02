class Solution {
    public int smallestEvenMultiple(int n) {
        int mul=1;
        if(n%2==0){
            return n;
        }
        else{
            return n*2;
        }
        
    }
}