package article;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
	String originPath; //原文路径
	String copyPath; //抄袭文本路径
	String filePath;  //答案路径
	String[] parms;  //接受参数
	
	if(args.length!=0) {
		parms=args;
	} else {
		System.out.println("请给出原文绝对路径，抄袭版论文绝对路径，输出答案文件的绝对路径【参数按顺序输入，并用空格隔开】");
		Scanner scanner=new Scanner(System.in);
		parms=scanner.nextLine().split(" ");
		if(parms.length<3) {
			System.out.println("没有完整输入文件的输入输出路径");
			System.exit(0);
		}
		scanner.close();
	}

	String file1=GetFiles.getFiles(parms[0]);
	String file2=GetFiles.getFiles(parms[1]);
	double cos=GetRepeatability.getRepeatability(file1, file2);
	
	
	
	String s =String.valueOf(cos);
	System.out.println(s);
	File file = new File(parms[2]);
	/*FileOutputStream a=new FileOutputStream(f);
	OutputStreamWriter b=new OutputStreamWriter(a);
	
	b.write(s);*/
	 file.createNewFile();

     FileWriter writer = new FileWriter(file);
     // 向文件写入内容
     writer.write(s);
     writer.flush();
     writer.close();
}

}

