package test;

import org.junit.Test;

import com.hust.npl.WordSeg;

public class WordSegTest {

	@Test
	public void test() throws Exception {
		String string = "电话 法定 假期 我 请 你 擦掉 的";
		String[] words = WordSeg.splitContent(string, " ");
		
		for(int i=0; i<words.length;i++)
			System.out.println(words[i]);
	}

}
