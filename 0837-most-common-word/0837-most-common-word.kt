class Solution {
    private val punctuations = setOf<Char>(
            '\"',
            '!',
            '?',
            '\'',
            ',',
            ';',
            '.',
            '\"'
        )

    fun mostCommonWord(paragraph: String, banned: Array<String>): String
        = paragraph
            .split(
                " ", "\"", "!", "?", "/", ",", ".", "\""
            )
            .map{ word -> //String
                word.lowercase().trim{ch -> punctuations.contains(ch)} 
            }.filter{word -> //List<String>
                word.isNotBlank() && !banned.contains(word) 
            }.groupingBy{word -> //List<String>
                word
            }.eachCount() //Map<String, Int>
            .maxBy{it.value}.key
}

