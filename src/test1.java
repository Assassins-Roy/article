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
	String str = "�����Ŀʲôʱ������";
	File file;//�����ļ���
	FileOutputStream stream = null;//new�ļ���
	try {
	file = new File("D:/a.txt");
	stream = new FileOutputStream (file);//���ļ��з����ļ�����
	if (!file.exists()) {
	file.createNewFile();
	}
	byte[] contentInBytes = str.getBytes();//ת�����ֽ���
	stream.write(contentInBytes);//д��
	stream.flush(); //д��֮��ˢ��
	stream.close();//�ر���
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}
	}
}
