package test;

import org.junit.Test;

import com.hust.npl.SetTags;

public class SetTagsTest {

	@Test
	public void test() {
		String string = "124";
		System.out.println(SetTags.isNumeric(string));
	}

}
