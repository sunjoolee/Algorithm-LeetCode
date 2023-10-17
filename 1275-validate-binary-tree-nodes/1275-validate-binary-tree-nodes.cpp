#include <iostream>

class Solution {
public:
    bool validateBinaryTreeNodes(int n, vector<int>& leftChild, vector<int>& rightChild) {
        vector<int> parent = vector<int>(n, -1);
        
        for(int i = 0; i<n; ++i){
            //left
            int child = leftChild[i];
            if(child != -1){
                //two parents
                if(parent[child] != -1) return false;
                
                int p = i;
                parent[child] = p;
                while(parent[p] != -1){
                    //cycle
                    if(p == child) return false;
                    parent[child] = parent[p];
                    p = parent[p];
                }
            }

            //right
            child = rightChild[i];
            if(child != -1){
                //two parents
                if(parent[child] != -1) return false;

                int p = i;
                parent[child] = p;
                while(parent[p] != -1){
                    //cycle
                    if(p == child) return false;
                    parent[child] = parent[p];
                    p = parent[p];
                }
            }
        }

        bool foundRoot = false;
        for(int i = 0; i<n; ++i){
            if(parent[i]== -1){
                //two root nodes
                if(foundRoot) return false;
                else foundRoot = true;
            }
        }

        return foundRoot;
    }
};