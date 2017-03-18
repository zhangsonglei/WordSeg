package com.hust.npl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadOrWriteFile {
	// 写文件
	public static void writerFile(String content,String filePath,boolean isNextWriter) {
		try {
            File file = new File(filePath);
            //if (!file.exists()) {
                file.createNewFile();
           // }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            BufferedWriter writer = new BufferedWriter(write);
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	// 读文件
	public static String readFile(String filePath, String encoding){
		String content = new String();
		
        try {
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = new String();
                    while((lineTxt = bufferedReader.readLine()) != null){
                        content += lineTxt; 
                    }
                    read.close();
                }else{
                	System.out.println("找不到指定的文件");
                }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
     return content;
    }
}