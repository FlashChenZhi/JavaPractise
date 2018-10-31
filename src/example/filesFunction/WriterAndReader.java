package example.filesFunction;

import java.io.*;

/**
 * 文件的写入和读取内容
 */
public class WriterAndReader {
    public static void main(String[] args) {
        //文件的写入
//        try{
//            BufferedWriter bw=new BufferedWriter(new FileWriter("D://test/tmp/abc/runoob.txt"));
//            bw.write("菜鸟教程");
//            bw.flush();
//            bw.close();
//            System.out.println("文件创建成功！");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        //文件的读取
//        try{
//            BufferedReader br=new BufferedReader(new FileReader("D://test/tmp/abc/runoob.txt"));
//            String str;
//            while((str=br.readLine())!=null){
//                    System.out.println(str);
//            }
//            System.out.println("读取文件完毕！");
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try{
            File file=new File("D://test/tmp/abc/employee.ser");
            if(file.delete()){
                System.out.println("文件删除成功！");
            }else{
                System.out.println("文件删除失败！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
