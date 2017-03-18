package test;

import org.junit.Test;

import com.hust.npl.ReadOrWriteFile;

public class ReadOrWriteFileTest {

	@Test
	public void test() throws Exception {
		String readFilePath = "E:\\test\\pku_training.utf8";
		String writeFilePath = "E:\\test\\res.txt";
		String encoding = "UTF-8";
		String content = null;
		
		content = ReadOrWriteFile.readFile(readFilePath);
		ReadOrWriteFile.writerFile(content, writeFilePath, true);
	}

}
