class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int a = x;
        while (a>0){
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a/10;
            }
            if(rev==x){
                return true;
            }
            else{
                return false;
            }
    }
    }
