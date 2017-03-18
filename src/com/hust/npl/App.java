package com.hust.npl;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//文档路径
    	String filePath= "E:\\test\\pku_training.utf8";
    	//设置文档格式
    	String encoding = "UTF-8";
    	//设置文档分割条件
    	String segCondition = ("\\s+");
    	//将文本分割按照segCondition分割
    	String content = ReadOrWriteFile.readFile(filePath,encoding);
    	//将文本原子分割
    	String[] sentences = WordSeg.splitContent(content,segCondition);
    	
//    	for(int i = 0; i < sentences.length; i++)
//    		System.out.println(sentences[i]);
    	
    	//统计词频
    	HashMap<String, Integer> fre = new HashMap<String, Integer>();
    	fre = Statistics.wordsCount(sentences);
    	//遍历词频
    	Statistics.showHashMap(fre);
    	
//    	String[][] words = WordSeg.splitSentence(sentences);
//    	
//    	for(int i = 0; i < sentences.length; i++) {
//    		for(int j=0;j<100;j++) {
//    			if(words[i][j]==null)
//    				continue;
//    			else
//    				System.out.print(words[i][j]+" ");
//    		}
//    		System.out.println();
//    	}
    	
    	
    	        
    }
}
