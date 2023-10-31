#include <string>

class Solution {
public:
    bool isPalindrome(int x) {
        string xStr = to_string(x);
        int l = 0;
        int r = xStr.length()-1;
        while(l<r){
            if(xStr[l] != xStr[r]) return false;
            l++;
            r--;
        }
        return true;
    }
};