package test;

import java.util.StringTokenizer;

import org.junit.Test;

import com.hust.npl.WordSeg;

public class WordSegTest {

	@Test
	public void test() throws Exception {
		String string = "我 想 ， 我 在 华中科技大学 。";
		StringTokenizer words = WordSeg.splitContent(string);
		
		while(words.hasMoreTokens())
			System.out.println(words.nextToken());
	}

}
