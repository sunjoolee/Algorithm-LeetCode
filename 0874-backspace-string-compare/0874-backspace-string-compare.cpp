#include <stack>

class Solution {
public:
    bool backspaceCompare(string s, string t) {
        stack<char> sStack;
        for(int i = 0; i<s.length(); ++i){
            //not '#'
            if(s[i] != '#') 
                sStack.push(s[i]);
            //'#'
            else if(!sStack.empty()) sStack.pop();
        }
        stack<char> tStack;
        for(int i = 0; i<t.length(); ++i){
            //not '#'
            if(t[i] != '#') 
                tStack.push(t[i]);
            //'#'
            else if(!tStack.empty()) tStack.pop();
        }

        if(sStack.size() != tStack.size()) return false;
        while(!sStack.empty()){
            if(sStack.top() != tStack.top()) return false;
            sStack.pop();
            tStack.pop();
        }
        return true;
    }
};