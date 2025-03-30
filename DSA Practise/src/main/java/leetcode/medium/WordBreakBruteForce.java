/**
 * 
 */
package main.java.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class WordBreakBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fullWord = "satishjaswivaka1";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);
		System.out.println("Is the Given String words are in the dictonary ? " +wordBreak(fullWord, wordDict));

	}
	
	public static boolean wordBreak(String s , List<String> wordDict){
		Set<String> wordSet = new HashSet<String>(wordDict);
		List<String> results = new ArrayList<String>();
		backTrack(s,wordSet, 0, "", results);
		if(!results.isEmpty()&&results.size()>0) {
			return true;
		}else return false;
	}
	
	public static void backTrack(String s ,Set<String> wordSet ,int start ,String path ,List<String> results) {
		
		if(start==s.length()) {
			results.add(path.trim());
				return;
			}
	
		for(int end=start+1;end<=s.length();end++) {
			
			String subWord = s.substring(start, end);
			if(wordSet.contains(subWord)) {
				backTrack(s, wordSet, end, path+subWord+" ", results);
			}
			
		}
		
	}

}
