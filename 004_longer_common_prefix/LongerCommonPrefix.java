/**
 * Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "". 

    Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

    Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.    

    Constraints:
        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.
 */
public class LongerCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        String common = longestCommonPrefix(strings);
        System.out.println(common);
    }

    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0 || strs == null) return "";
        String commonPrefix = strs[0];
        for(int i = 1; i < n; i++){
            while(strs[i].indexOf(commonPrefix) != 0){
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if(commonPrefix.isEmpty()) return "";
            }            
        }
        return commonPrefix;
    }
}
