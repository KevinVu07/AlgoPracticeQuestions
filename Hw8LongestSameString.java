/* Write a function to find the longest common prefix string amongst an array of strings
If there is no common prefix, return an empty string "" 

Example 1:
	Input: strs = ["flower", "flow", "flight"]
	Outpit: "fl"
	
Example 2: 
	Input: strs = ["dog", "racecar", "car"]
	Output: ""
	Explanation: there is no common prefix among the input strings.
*/

package Algorithms;

import java.util.ArrayList;

public class Hw8LongestSameString {

	

	public static void main(String[] args) {
		String[] strs = { "flu", "flight", "flow", "fly", "fluuuuu"};
		String longestCommonPrefix = findLongestCommonPrefix(strs);
		
		if (longestCommonPrefix == "") {
			System.out.println("There is no common prefix (empty string) between strings in this array");
		} else {
			System.out.println("The longest common prefix string amongst the strings in this array is " + longestCommonPrefix);
		}
	}

	public static String findLongestCommonPrefix(String[] strs) {
		
		 if (strs.length == 0) return "";
		    String commonprefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(commonprefix) != 0) {
		        	commonprefix = commonprefix.substring(0, commonprefix.length() - 1);
		            if (commonprefix.isEmpty()) return "";
		        }        
		    return commonprefix;
	}
}
