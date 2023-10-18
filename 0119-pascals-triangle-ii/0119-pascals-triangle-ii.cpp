class Solution {
public:
    vector<int> getRow(int rowIndex) {
        if(rowIndex == 0) return {1};
        else if(rowIndex == 1) return {1,1};
        
        //rowIndex >= 2
        vector<int> curRow = {1,1};
        for(int r = 2; r<=rowIndex;++r){
            vector<int> nextRow = vector<int>();

            nextRow.push_back(1);
            for(int i = 0;i<curRow.size()-1;++i){
                nextRow.push_back(curRow[i] + curRow[i+1]);
            }
            nextRow.push_back(1);

            curRow.clear();
            curRow.assign(nextRow.begin(), nextRow.end());
        }
        return curRow;
    }
};