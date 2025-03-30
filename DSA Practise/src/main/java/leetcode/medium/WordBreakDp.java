package main.java.leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakDp {

	public boolean wordBreak(String s, List<String> wordDict) {
		// convert list to set for faster retrieval
		Set<String> wordSet = new HashSet<>(wordDict);

		// Get the max length of the word in the list
		int maxStringlen = wordSet.stream().mapToInt(String::length).max().orElseThrow();

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = i - 1; j >= Math.max(0, i - maxStringlen); j--) {
				if (dp[j] && wordSet.contains(s. substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

}
