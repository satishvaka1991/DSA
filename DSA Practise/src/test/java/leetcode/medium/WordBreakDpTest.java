package test.java.leetcode.medium;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.leetcode.medium.WordBreakDp;

public class WordBreakDpTest {
	
	
	private final WordBreakDp wordBreak;
	
	 public WordBreakDpTest(){
		wordBreak= new WordBreakDp();
	}

	@Test
	public void testWordBreak1() {
		String wholeString = "satishjaswivaka";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertTrue(wordBreak.wordBreak(wholeString, wordDict));
	}
	
	@Test
	public void testWordBreak2() {
		String wholeString = "satishjaswivaka1";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertFalse(wordBreak.wordBreak(wholeString, wordDict));
	}

	@Test
	public void testWordBreak3() {
		String wholeString = "satishjaswika";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertTrue(wordBreak.wordBreak(wholeString, wordDict));
	}
	
	@Test
	public void testWordBreak4() {
		String wholeString = "satishjaswika";
		String[] dict = { "vaka", "jaswika", "ammu", "jaswi", "satish" };
		List<String> wordDict = Arrays.asList(dict);		
		assertTrue(wordBreak.wordBreak(wholeString, wordDict));
	}
	  @Test
	  public void testWordBreak5() {
	    assertTrue(wordBreak.wordBreak("aaaaaaa", java.util.List.of("aaaa", "aaa")));
	  }

	  @Test
	  public void testWordBreak6() {
	    assertFalse(wordBreak.wordBreak("aaaaa", java.util.List.of("aaaa", "aaa")));
	  }

}
