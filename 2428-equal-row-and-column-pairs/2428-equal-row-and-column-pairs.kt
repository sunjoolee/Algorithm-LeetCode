class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val n = grid.size
        val rowMap: MutableMap<Int, String> = mutableMapOf()
        val colMap: MutableMap<Int, String> = mutableMapOf()

        // init row map
        for(r in 0 until n){
            rowMap[r] = grid[r].toList().toString()
        }
        // init column map
        for(c in 0 until n){
            colMap[c] = mutableListOf<Int>().apply{
                for(r in 0 until n) add(grid[r][c])
            }.toString()
        }
        
        // count identical strings in maps
        val rowCountMap = rowMap.values.groupingBy{it}.eachCount() // MutableMap<String, Int>
        val colCountMap = colMap.values.groupingBy{it}.eachCount() // MutableMap<String, Int>
        
        var answer: Int = 0
        for(row in rowCountMap.keys){
            if(colCountMap.containsKey(row)){
                answer += rowCountMap[row]!! * colCountMap[row]!!
            }
        }
        return answer
    }
}