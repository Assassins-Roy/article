package article;

import java.io.IOException;
import java.util.Scanner;

import com.hankcs.hanlp.tokenizer.StandardTokenizer;

public class TestMain {
public static void main(String[] args) throws IOException {
	 Scanner sc = new Scanner(System.in); 
	 int flag = sc.nextInt();    //读取整型输入 
	if(flag==1) {
		String file1=GetFiles.getFiles("D:\\test\\orig.txt");
		String file2=GetFiles.getFiles("D:\\test\\orig_0.8_add.txt");
		double cos=GetRepeatability.getRepeatability(file1, file2);
		System.out.println(cos);
	}else if(flag==2) {
		String file1=GetFiles.getFiles("D:\\test\\orig.txt");
		String file2=GetFiles.getFiles("D:\\test\\orig_0.8_del.txt");
		double cos=GetRepeatability.getRepeatability(file1, file2);
		System.out.println(cos);
	}else if(flag==3) {
		String file1=GetFiles.getFiles("D:\\test\\orig.txt");
		String file2=GetFiles.getFiles("D:\\test\\orig_0.8_dis_1.txt");
		double cos=GetRepeatability.getRepeatability(file1, file2);
		System.out.println(cos);
	}else if(flag==4) {
		String file1=GetFiles.getFiles("D:\\test\\orig.txt");
		String file2=GetFiles.getFiles("D:\\test\\orig_0.8_dis_10.txt");
		double cos=GetRepeatability.getRepeatability(file1, file2);
		System.out.println(cos);
	}else if(flag==5) {
		String file1=GetFiles.getFiles("D:\\test\\orig.txt");
		String file2=GetFiles.getFiles("D:\\test\\orig_0.8_dis_15.txt");
		double cos=GetRepeatability.getRepeatability(file1, file2);
		System.out.println(cos);
	}
	
	
	
}
	
}
