package com.hust.npl;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 2017/03/15
 * By 张松磊
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//文档路径
    	String filePath= "files\\train\\pku_training.utf8";
    	//读取文件
    	String content = ReadOrWriteFile.readFile(filePath);
    	//将文本按空格和标点分割
    	StringTokenizer sentences = WordSeg.splitContent(content);
    	
    	String string = SetTags.setTag(sentences);
    	
    	ReadOrWriteFile.writerFile(string, "files\\Tag\\hasTagged.txt", true);
    	//统计词频
    	HashMap<String, Integer> fre = new HashMap<String, Integer>();
    	fre = Statistics.wordsCount(sentences);
    	//遍历词频
    	Statistics.showHashMap(fre);
    	    	        
    }
}
