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
	String originPath; //ԭ��·��
	String copyPath; //��Ϯ�ı�·��
	String filePath;  //��·��
	String[] parms;  //���ܲ���
	
	if(args.length!=0) {
		parms=args;
	} else {
		System.out.println("�����ԭ�ľ���·������Ϯ�����ľ���·����������ļ��ľ���·����������˳�����룬���ÿո������");
		Scanner scanner=new Scanner(System.in);
		parms=scanner.nextLine().split(" ");
		if(parms.length<3) {
			System.out.println("û�����������ļ����������·��");
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
     // ���ļ�д������
     writer.write(s);
     writer.flush();
     writer.close();
}

}

