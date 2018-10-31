package example.filesFunction;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.Date;

import static sun.plugin2.os.windows.Windows.*;

/**     文件相关操作方法
 * 1.创建临时文件：使用 File 类的 createTempFile(String prefix, String suffix); 方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀
 * 2.创建文件：使用 File 类的 File() 构造函数和 file.createNewFile() 方法来创建一个新的文件
 * 3.在指定目录中创建文件：使用 File 类的 file.createTempFile() 方法在指定目录中创建文件
 * 4.获取文件最后修改时间：使用 File 类的 file.lastModified() 方法来获取文件最后的修改时间
 * 5.修改文件最后的修改日期：使用 File 类的 fileToChange.lastModified() 和 fileToChange setLastModified() 方法来修改文件最后的修改日期
 * 6.获取文件大小：使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）
 * 7.设置文件只读：使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读
 * 8.文件重命名：使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
 * 9.检测文件是否存在：使用 File 类的 file.exists() 方法来检测文件是否存在
 * 10.文件路径比较：使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下
 */
public class FileOperator {
    public static void main(String[] args) throws Exception {
//        //向文件中追加内容：使用 filewriter 方法向文件中追加数据
//        try {
//            //1.创建字符缓冲输出流对象和指定写入文件
//            BufferedWriter bw = new BufferedWriter(new FileWriter("filename"));
//            //2.通过输出流对象写入文件内容，并关闭流对象
//            bw.write("Hello World!\n");
//            bw.close();
//            //3.重新创建字符缓冲输出流对象，并将写入文件的参数追加写入文件改为true
//            bw = new BufferedWriter(new FileWriter("filename", true));
//            //4.向写入文件对象中追加内容，然后关闭流对象
//            bw.write("Add Data description\n");
//            bw.write("Continue insert into Data2\n");
//            bw.write("Continue insert into Data3\n");
//            bw.close();
//            //5.创建字符缓冲输入流对象和读取文件
//            BufferedReader br = new BufferedReader(new FileReader("filename"));
//            String str;
//            //6.定义字符串用于接收流对象逐行读取的内容，同时进行判空处理，循环打印内容后，退出循环关闭流对象
//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //1.1 方法一：创建临时文件
//        File tempFile=File.createTempFile("testrunoobtmp",".txt");
//        System.out.println("显示文件绝对路径："+tempFile.getAbsolutePath());
//        tempFile.deleteOnExit();
//        BufferedWriter  bw=new BufferedWriter(new FileWriter(tempFile));
//        bw.write("Add description to testtunoobtmp.txt");
//        System.out.println("临时文件已经创建好了");
//        bw.close();
//        BufferedReader br=new BufferedReader(new FileReader(tempFile));
//        String str;
//        while((str=br.readLine())!=null){
//            System.out.println(str);
//        }
//        br.close();

        //1.2 方法二：创建临时文件
//        File f=null;
//        try{
//            // 创建临时文件
//            f=File.createTempFile("testTemp",".txt",new File("D://test/tmp"));
//            //输出文件的绝对路径
//            System.out.println("输出文件绝对路径："+f.getAbsolutePath());
//            // 终止后删除临时文件
//            f.deleteOnExit();
//
//            //或者可以写成这样的形式
//            // 创建临时文件
//            f = File.createTempFile("tmp", null, new File("D://test/tmp"));
//            // 输出绝对路径
//            System.out.print("File path: "+f.getAbsolutePath());
//            // 终止后删除临时文件
//            f.deleteOnExit();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //2.创建文件
//            try{
//                File file=new File("D://test/tmp/abc/test.txt");
//                if(file.createNewFile()){
//                    System.out.println("文件创建成功！");
//                }else{
//                    System.out.println("出错了，该文件已经存在了...");
//                }
//            }catch (IOException e){
//                e.printStackTrace();
//            }

        // 3.在指定目录中创建文件
//                File file = null;
//                File dir=new File("D://test/tmp/abc");
//                file=File.createTempFile("JavaTemp",".javatemp",dir);
//                System.out.println("指定目录下文件的路径："+file.getPath());
//                System.out.println("指定目录下文件的绝对路径："+file.getAbsolutePath());

        //4. 获取文件修改日期
//        File file = new File("D://test/tmp/abc/test.txt");
//        long lastModified = file.lastModified();
//        Date date = new Date(lastModified);
//        System.out.println("获取文件最后修改时间：" + date);

        //5.修改文件最后的修改日期：
        //1.通过创建文件对象获取最终修改时间，转化成日期格式化转成字符串显示
//        File fileToChange=new File("D://test/tmp/abc/testChange.txt");
//        fileToChange.createNewFile();
//        Date fileTime=new Date(fileToChange.lastModified());
//        System.out.println("文件修改后的时间："+fileTime.toString());
//        System.out.println("设置文件修改的最后时间："+fileToChange.setLastModified(System.currentTimeMillis()));
//        fileTime=new Date(fileToChange.lastModified());
//        System.out.println(fileTime.toString());

        //6.获取文件大小
//        File file = new File("D://test/tmp/abc/test.txt");
//        if(!file.exists() || !file.isFile()){
//            System.out.println("文件不存在！");
//            System.out.println("该文件大小为："+file.length());
//        }else{
//            System.out.println("该文件大小为："+file.length());
//        }

        //7.设置文件只读
//        File file = new File("D://test/tmp/abc/test.txt");
//        //设置文件可读状态
//        System.out.println("设置文件为可读状态："+(file.setReadOnly() ? "可读" : "不可读"));
//        System.out.println("显示文件当前是否为可写状态："+(file.canWrite() ? "可写" : "不可写"));
//        //设置文件可写状态
//        System.out.println(""+file.setWritable(true,true));

        //8.文件名重命名
//        File file1 = new File("D://test/tmp/abc/oldName.txt");
//        File file2 = new File("D://test/tmp/abc/newName.txt");
//        if(file1.renameTo(file2)){
//            System.out.println("已重命名");
//        }else{
//            System.out.println("发生错误！");
//        }

        //9.检测文件是否存在
//        File file = new File("D://test/tmp/abc/newName.txt");
//        System.out.println("检测文件是否存在："+(file.exists() ? "存在" : "不存在"));

        //10.文件路径比较：检测是否属于同一个文件
        File file1 = new File("D://test/tmp/abc/oldName.txt");
        File file2 = new File("D://test/tmp/abc/newName.txt");
        if(file1.compareTo(file2)==0){
            System.out.println(file1.compareTo(file2));
            System.out.println("文件路径一致！");
        }else {
            System.out.println(file1.compareTo(file2));
            System.out.println("文件路径不一致...");
        }

    }

}
