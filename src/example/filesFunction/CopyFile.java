package example.filesFunction;

import java.io.*;

/**
 * 将文件内容复制到另一个文件
 */
public class CopyFile {
    public static void main(String[] args) throws Exception{
        //1.定义字符缓冲输出流，同时创建写入文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("srcFile"));
        //2.将字符串写入文件后关闭流
        bw.write("String to be copyFile");
        bw.flush();
        bw.close();
        //3.创建文件输入流对象 和 文件输出流对象
        InputStream is=new FileInputStream(new File("srcFile"));
        OutputStream os=new FileOutputStream(new File("destnfile"));
        //4.定义字节数组，通过判断循数组长度来环读取该数组，同时向文件输出流对象的文件写入内容
        byte[] by=new byte[1024];
        int len;
        while((len=is.read(by))>0){
            os.write(by,0,len);
        }
        //5.关闭文件输入流对象和文件输出流对象
        is.close();
        os.close();
        //6.定义字符缓冲输入流对象，，同时创建读取文件
        BufferedReader bufferedReader= new BufferedReader(new FileReader("destnfile"));
        String str;
        //7.定义字符串，通过对字符缓冲输入流对象逐行读取存入字符串并判空处理，循环中打印字符串，退出后关闭流对象
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();

    }

}
