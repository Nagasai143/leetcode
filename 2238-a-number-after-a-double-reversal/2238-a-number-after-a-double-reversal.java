class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp_1;
        int orginal=num;
        int reverse=0;
        int Orginal_1=0;
        int temp_2;
        while(num>0){
            temp_1=num%10;
            reverse=reverse*10+ temp_1;
           num= num/10;
        }
        while(reverse>0){
            temp_2=reverse%10;
            Orginal_1=Orginal_1*10+temp_2;
           reverse= reverse/10;
        }
        if(orginal==Orginal_1){
            return true;
        }else{
            return false;
        }
        
    }
}