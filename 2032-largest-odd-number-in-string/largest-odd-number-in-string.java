class Solution {
    public String largestOddNumber(String s) {
        int j=-1, n=s.length();
        for(int i=n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                j=i;
                break;
            }
        }
        if(j==-1)
        return"";

        int i=0;
        while(i<=n){
            if(s.charAt(i)!='0')
            break;
            i++;
        }
        return s.substring(i,j+1);
    }
}
    
