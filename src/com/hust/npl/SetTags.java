package com.hust.npl;

import java.util.StringTokenizer;
import java.lang.Character;

public class SetTags {
	public static String setTag(StringTokenizer st) throws Exception {
		
		String hasTagged = new String();
		while(st.hasMoreTokens()) { 
			
			String str = st.nextToken();
			if(isNumeric(str)) {
				String word = str+"/S";
				hasTagged += word;
				hasTagged += "\n";
			}
			else {
				String[] words = str.split("");
				
				//按照4-tags方法对词语进行标记
				if(words.length == 1)
					words[0] += "/S";
				else if(words.length == 2) {
					words[0] += "/B";
					words[1] += "/E";
				}
				else if(words.length > 2){
					words[0] += "/B";
					words[words.length - 1] += "/E";
					for(int i = 1; i < words.length - 1; i++) {
						words[i] += "/M";
					}
				}
				else {
					System.out.println("error in seting tags:SetTags.java");
				}
				
				//将标记好的字拼接成字符串
				for(int i = 0; i < words.length; i++)
					hasTagged +=words[i];
				hasTagged += "\n";
			}
			
		}
		
		return hasTagged;
	}
	
	//判断字符串是否是数字
	public static boolean isNumeric(String str) {  
		for (int i = str.length();--i>=0;) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		
		return true;  
	}  
}
