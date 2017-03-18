package com.hust.npl;

import java.util.HashMap;
import java.util.Map.Entry;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Statistics {
	//将String[]中的数据读入HashMap并统计频率
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static HashMap<String, Integer> wordsCount(String[] words) throws Exception {
		int count = 1;
		for(int i = 0; i < words.length; i++) {
			if(map.containsKey(words[i]) != false) {//判断数据是否已存在
				count = map.get(words[i]) + 1;
			}
			map.put(words[i],count);
		}
		
		return map;
	}
	
	//将String[]中的数据读入二维HashMap并统计字与前者之间的关系频率
	static HashMap<String, HashMap<String, Integer>> array = new HashMap<String, HashMap<String,Integer>>();
	public static HashMap<String, HashMap<String, Integer>> wordsArray(String[] words) throws Exception {
		int count = 1;
		for(int i = 0; i < words.length; i++) {
			String[] word = words[i].split(""); //将词进行原子分割
			
			
			
		}
			
		return array;
	}
	
	//遍历输出HashMap
	public static void showHashMap(HashMap<String, Integer> map) throws Exception {
		for(Entry<String, Integer> entry : map.entrySet())
    		System.out.println(entry.getKey().toString()+":"+entry.getValue());
	}
}
