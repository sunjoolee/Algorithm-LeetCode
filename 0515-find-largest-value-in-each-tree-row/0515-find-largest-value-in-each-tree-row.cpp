/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

#include <algorithm>
#include <queue>
#include <limits>

class Solution {
public:
    vector<int> largestValues(TreeNode* root) {
        if(root == nullptr) return vector<int>();
        
        //array of max value in each row
        vector<int> answer = vector<int>();
        
        queue<TreeNode*> curRowQ;
        queue<TreeNode*> nextRowQ;

        curRowQ.push(root);
        int rowMax = INT_MIN;
        while(!curRowQ.empty()){
            TreeNode* curNode = curRowQ.front();
            curRowQ.pop();

            rowMax = max(rowMax, curNode->val);

            if(curNode->left != nullptr) nextRowQ.push(curNode->left);
            if(curNode->right != nullptr) nextRowQ.push(curNode->right);
           
            if(curRowQ.empty()){
                answer.push_back(rowMax);
                rowMax = INT_MIN;

                if(nextRowQ.empty()) break;

                curRowQ = nextRowQ;
                nextRowQ = queue<TreeNode*>();
           }
        }
        return answer;
    }
};