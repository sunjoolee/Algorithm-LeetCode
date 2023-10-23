#include <cmath>

class Solution {
public:
    bool isPowerOfFour(int n) {
        if(n <= 0) return false;

        double log2n = log2(n);
        if((int)log2n != ceil(log2n)) return false;
        if((int)log2n % 2 != 0) return false;
        return true;
    }
};