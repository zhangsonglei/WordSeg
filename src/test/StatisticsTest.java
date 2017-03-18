package test;

import java.util.StringTokenizer;

import org.junit.Test;

import com.hust.npl.Statistics;

public class StatisticsTest {

	@Test
	public void test() throws Exception {
		StringTokenizer str = new StringTokenizer("我 想 ， 我 在 华中科技大学 。");
		Statistics.showHashMap(Statistics.wordsCount(str));
		
	}

}
