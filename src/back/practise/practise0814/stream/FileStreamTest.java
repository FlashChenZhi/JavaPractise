package back.practise.practise0814.stream;

import java.io.*;

public class FileStreamTest {

    public static void main(String[] args) throws IOException{
        File file=new File("D:\\a.txt");
        // 构建FileOutputStream对象,文件不存在会自动新建
        FileOutputStream fos=new FileOutputStream(file);
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        // 写入到缓冲区
        osw.append("中文输入");
        osw.append("\r\n");
        osw.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        osw.close();
        // 关闭输出流,释放系统资源
        fos.close();

        // 构建FileInputStream对象
        FileInputStream fis=new FileInputStream(file);
        // 构建InputStreamReader对象,编码与写入相同
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
        StringBuffer sb=new StringBuffer();

        while(isr.ready()){
            // 添加到StringBuffer对象中
            sb.append(isr.read());
        }
        System.out.println(sb.toString());
        // 关闭读取流
        isr.close();
        // 关闭输入流,释放系统资源
        fis.close();


    }

}
