package article;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.print.attribute.standard.PrinterLocation;
import javax.print.event.PrintServiceAttributeListener;

import com.hankcs.hanlp.tokenizer.StandardTokenizer;

public class GetFiles {
	public static String getFiles(String filePath) {
		String result = "";
		  try {
		    File file = new File(filePath);
		    if(file.isFile() && file.exists()) {
		      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
		      BufferedReader br = new BufferedReader(isr);
		      String lineTxt = null;
		    
		      while ((lineTxt = br.readLine()) != null) {
		    	
		     result+=lineTxt;
		   
		      }
		      br.close();
		    } else {
		      System.out.println("文件不存在!");
		   
		    }
		  } catch (Exception e) {
		    System.out.println("文件读取错误!");
		  }
		 
		return result;
		 
		
		
		 
		  }
}
