package test.java.leetcode.medium;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.leetcode.medium.WordBreakBruteForce;

public class WordBreakTest {

	@Test
	public void testWordBreak1() {
		String wholeString = "satishjaswivaka";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertTrue(WordBreakBruteForce.wordBreak(wholeString, wordDict));
	}
	
	@Test
	public void testWordBreak2() {
		String wholeString = "satishjaswivaka1";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertFalse(WordBreakBruteForce.wordBreak(wholeString, wordDict));
	}

	@Test
	public void testWordBreak3() {
		String wholeString = "satishjaswika";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertTrue(WordBreakBruteForce.wordBreak(wholeString, wordDict));
	}
}
