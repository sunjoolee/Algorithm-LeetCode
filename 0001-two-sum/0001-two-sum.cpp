#include <algorithm>
#include <unordered_map>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //<target-nums[index], index>
        unordered_map<int, int> m;

        int size = nums.size();
        for(int i = 0; i<size;++i){
            //a+b = target
            //b = target-a
            int a = nums[i];
            if(m.find(a) != m.end()){
                return vector<int>{m[a],i};
            }
            else{ 
                m[target-a] = i;
            }
        }

        return vector<int>{-1, -1}; //no answer
    }
};