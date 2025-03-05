
/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 *
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * ُreverseString(charArrayOf('h','e','l','l','o'))
 *
 * */
fun reverseString(s: CharArray): Unit {
    val original = charArrayOf(*s)
    var index = 0
    for (c in s.size - 1 downTo 0) {
        s[index] = original[c]
        index++
    }
    println(s)
}