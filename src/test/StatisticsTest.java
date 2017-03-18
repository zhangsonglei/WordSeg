package test;

import org.junit.Test;

import com.hust.npl.Statistics;

public class StatisticsTest {

	@Test
	public void test() throws Exception {
		String[] str = {"其二","期望","很大","UI","市场空间","是擦柯斯达外地我去打球","其二"};
		Statistics.showHashMap(Statistics.wordsCount(str));
		
	}

}
