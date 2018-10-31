package example.filesFunction;


import java.io.*;

/**
 *  向文件中追加内容
 */
public class AddDataFile {
    public static void main(String[] args) throws Exception{
        /**
         * 描述：追加内容到文件末尾
         * @author Roger Federer
         */
        File fileOrFilename = new File("D://test/tmp/abc/appendFile.txt");
        // 方法 一：使用FileOutputStream，在构造FileOutputStream时，把第二个参数设为true
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOrFilename, true)));
        out.write("first 第一种方式: \r\n");
        out.write("使用FileOutputStream，");
        out.write("在构造FileOutputStream时，把第二个参数设为true");
        out.close();
        BufferedReader br = new BufferedReader(new FileReader(fileOrFilename));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();

        // 方法 二：使用FileWriter
        // 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
        // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
//        FileWriter fw = new FileWriter(fileOrFilename, true);
//        fw.write("second第二种方式:\r\n");
//        fw.write("根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象\r\n");
//        fw.write("打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件\r\n");
//        fw.close();
//        BufferedReader br=new BufferedReader(new FileReader(fileOrFilename));
//        String str;
//        while((str=br.readLine())!=null){
//            System.out.println(str);
//        }
//        br.close();

        //BufferedWriter output = new BufferedWriter(new FileWriter(f,true));
        //方法 三：使用RandomAccessFile
        // 打开一个随机访问文件流，按读写方式
//        RandomAccessFile randomFile = new RandomAccessFile(fileOrFilename, "rw");
//        // 文件长度，字节数
//        long fileLength = randomFile.length();
//        // 将文件指针移到文件尾
//        randomFile.seek(fileLength);
//        randomFile.writeBytes("third 追加的内容：\r\n");
//        randomFile.writeBytes("使用RandomAccessFile\r\n");
//        randomFile.writeBytes(" 打开一个随机访问文件流，按读写方式\r\n");
//        randomFile.close();
//        BufferedReader out=new BufferedReader(new FileReader(fileOrFilename));
//        String read;
//        while((read=out.readLine())!=null){
//            System.out.println(read);
//        }
//        out.close();
    }


    /**
     * 在文件前面追加文件内容
     * @param
     * @return
     */
    public static void fileAppender(String fileName, String contents)
            throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        // 一行一行的读
        StringBuilder sb = new StringBuilder();
        sb.append(contents);
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append("\r\n");
        }
        reader.close();
        //写回去
        RandomAccessFile write = new RandomAccessFile(fileName, "rw");
        write.writeBytes(sb.toString()); //<---会产生中文乱码
        write.close();
    }

}
