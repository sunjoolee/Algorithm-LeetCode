class Solution {
    private val logComparator = object:Comparator<String>{
        override fun compare(log1:String, log2:String): Int {
            if(log1 == log2) return 0

        	val data1 = log1.substringAfter(" ")
            val data2 = log2.substringAfter(" ")
            
            val isLetter1 = data1.isLetterLog()
            val isLetter2 = data2.isLetterLog()
            
            if(isLetter1 && isLetter2){ //letter log끼리 정렬
                return if(data1 != data2) data1.compareTo(data2) else log1.compareTo(log2)
            }
            if(isLetter1 && !isLetter2){ //letter log 뒤 digit log
            	return -1 
            }
            if(!isLetter1 && isLetter2){ //letter log 뒤 digit log
            	return 1 
            }
            if(!isLetter1 && !isLetter2){ //digit log 순서 유지
            	return 0
            }
            
        	return 1 //not reached
        }
    }
    
    private fun String.isLetterLog()
        = this.filter{it in '0'..'9'}.isBlank()
    
    fun reorderLogFiles(logs: Array<String>): Array<String> 
    	= logs.toList().sortedWith(logComparator).toTypedArray()
}