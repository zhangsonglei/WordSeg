package com.hust.npl;

public class WordSeg {
	//将文本内容按照要求进行切分
	public static String[] splitContent(String content, String condition) throws Exception {
		String[] sentences = content.split(condition);
		
		return sentences;
	}
	
	//将切分好的短句进行原子分割
	public static String[][] splitSentence(String[] sentence) throws Exception {
		String[][] words = new String[sentence.length][100];
		for(int i=0;i<sentence.length;i++) {
			String[] wordsStrings = sentence[i].split("");
			for(int j=0;j<wordsStrings.length;j++)
				words[i][j]=wordsStrings[j];
		}
		return words;
	}

}
