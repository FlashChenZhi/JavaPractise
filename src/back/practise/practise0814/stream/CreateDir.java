package back.practise.practise0814.stream;

import java.io.File;

/**
 * mkdirs()方法创建一个文件夹和它的所有父文件夹
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirName="D://test/tmp/abc";
        File file=new File(dirName);
        file.mkdirs();
        System.out.println("创建父目录和相关文件夹成功！");
    }

}
