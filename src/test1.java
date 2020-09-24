import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

public class test1 {
	public static void main(String[] args) throws IOException{
	String str = "这个项目什么时候上线";
	File file;//创建文件夹
	FileOutputStream stream = null;//new文件流
	try {
	file = new File("D:/a.txt");
	stream = new FileOutputStream (file);//将文件夹放在文件流中
	if (!file.exists()) {
	file.createNewFile();
	}
	byte[] contentInBytes = str.getBytes();//转化成字节形
	stream.write(contentInBytes);//写入
	stream.flush(); //写完之后刷新
	stream.close();//关闭流
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}
	}
}
