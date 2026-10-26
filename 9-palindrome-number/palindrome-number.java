class Solution {
    public int reverse(int n){
        int revNum=0;
        while(n>0){
        int lastDigit=n%10;
        revNum=revNum*10+lastDigit;
        n=n/10;
    }
    return revNum;
    }
    public boolean isPalindrome(int x) {
       int revNum=reverse(x);
       return x==revNum; 
    }
}