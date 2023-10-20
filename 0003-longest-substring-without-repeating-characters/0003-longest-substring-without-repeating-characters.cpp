#include <set>
#include <algorithm>

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int answer = 0;
        for(int start = 0; start < s.length(); ++start){
            //s[start]~s[start+i]까지 문자열 내 char 저장
            set<char> substrSet;
            for(int i = 0; start+i < s.length(); ++i){
                if(substrSet.find(s[start+i]) == substrSet.end()){
                    substrSet.insert(s[start+i]);
                }
                else break;
            }
            answer = max(answer,(int)substrSet.size()); 
        }
        return answer;
    }
};