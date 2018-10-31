package example.directoryOperation;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.sql.Date;

/**
 * 1.递归创建目录：使用 File 类的 mkdirs() 实现递归创建目录
 * 2.删除目录：使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录
 * 3.判断目录是否为空 ：使用 File 类的 file.isDirectory() 和 file.list() 方法来判断目录是否为空
 * 4.判断文件是否隐藏：使用 File 类的 file.isHidden() 方法来判断文件是否隐藏
 * 5.获取目录大小：使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小
 * 6.在指定目录中查找文件：使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表
 * 7.获取文件的上级目录：使用 File 类的 file.getParent() 方法来获取文件的上级目录
 * 8.获取目录最后修改时间：使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间
 * 9.打印目录结构：使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构
 * 10.遍历指定目录下的所有目录：使用 File 类的 list 方法来遍历指定目录下的所有目录
 * 11.输出指定目录下的所有文件：使用 File 类的 list 方法来输出指定目录下的所有文件
 * 12.查看系统根目录 ：使用 File 类的 listRoots() 方法来输出系统所有根目录
 * 13.查看当前工作目录：使用 System 的 getProperty() 方法来获取当前的工作目录
 * 14.遍历目录：使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录
 */
public class DirectoryDemo {
    public static void main(String[] args) throws IOException {

        //1.递归创建目录
//        String directories="D:\\test\\a\\b\\c\\d\\e\\f\\g\\h";
//        File file=new File(directories);
//        boolean result=file.mkdirs();
//        System.out.println("递归创建目录状态："+(result ? "创建成功" : "创建失败"));

        //2. 删除目录
        // 删除当前目录下的 test 目录
//        deleteDir(new File("D://test/a"));

        //3.判断目录是否为空
//        File file=new File("D://test/tmp");
//        if(file.isDirectory()) {
//            if (file.list().length>0) {
//                System.out.println("目录不为空!");
//            }else{
//                System.out.println("目录为空!");
//            }
//        }else{
//            System.out.println("这不是一个目录！");
//        }

        //4.判断文件是否隐藏
//        File f=new File("D://test/tmp/abc/test.txt");
//        System.out.println("文件test.txt是否属于隐藏属性："+(f.isHidden() ? "是" :  "否"));

        //5.获取目录大小FileUtils
        //由于未导入FileUtils相关Jar包，此方法暂不能使用
//        long size = FileUtils.sizeOfDirectory(new File("C:/test"));
//        System.out.println("Size: " + size + " bytes");

        //6.在指定目录中查找文件
//        File file=new File("d://test/tmp/abc");
//        String [] children =file.list();
//        int count=0;
//        if(children==null){
//            System.out.println("该目录不存在！");
//        }else {
//            for(int i=0;i<children.length;i++){
//                String filename=children[i];
//                System.out.print(filename+"\t");
//                count++;
//                if(count%2==0){
//                    System.out.println();
//                }
//            }
//        }

        //7.获取文件的上级目录
//        File file=new File("d://test/tmp/abc/appendFile.txt");
//        String strParentDirectory=file.getParent();
//        System.out.println("文件appendFile.txt的所有父级目录为："+strParentDirectory);

        //8.获取目录最后修改时间
//        File file=new File("D://test/tmp/abc/test.txt");
//        System.out.println("最后修改时间：" + new Date(file.lastModified()));

        //9.打印目录结构
//        showDir(1,new File("D://test/tmp/abc"));

        //10.遍历指定目录下的所有目录
//        File dir=new File("D://test/tmp");
//        File[] files=dir.listFiles();
//        FileFilter fileFilter=new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory();
//            }
//        };
//        files=dir.listFiles(fileFilter);
//        System.out.println("目录长度为："+files.length);
//        if(files.length==0){
//            System.out.println("目录不存在或它不是一个目录");
//        }else{
//            for(int i=0;i<files.length;i++){
//                File file=files[i];
//                System.out.println("文件名称："+file.toString());
//            }
//        }

        //11.输出指定目录下的所有文件
//        File dir = new File("D:");
//        String[] children=dir.list();
//        if(children==null){
//            System.out.println("该磁盘下目录不存在或它不是一个目录");
//        }else{
//            for(int i=0;i<children.length;i++){
//                String filenames=children[i];
//                System.out.println("文件名："+filenames);
//            }
//        }

        //12.查看系统根目录
//        File[] roots=File.listRoots();
//        System.out.println("系统所有根目录：");
//        for(int i=0;i<roots.length;i++){
//            System.out.println(roots[i].toString());
//        }

        //13.查看当前工作目录
//        String userDir=System.getProperty("user.dir");
//        System.out.println("查看当前工作目录："+userDir);

        //14.遍历目录
        File file=new File("D://test/tmp");
        System.out.println("遍历目录");
        visitAllDirsAndFiles(file);

    }

    //删除文件目录的方法
    public static  boolean deleteDir(File dir){
        if(dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                System.out.println(success);
                if (!success) {
                    return false;
                }
            }
        }
                if(dir.delete()) {
                    System.out.println("目录已被删除！");
                    return true;
                } else {
                    System.out.println("目录删除失败！");
                    return false;
                }
        }

      //打印目录结构的方法
      public static void showDir(int indent,File file) throws IOException {
            for(int i=0;i<file.length();i++){
                System.out.print("-");
            }
            System.out.println(file.getName());
            if(file.isDirectory()){
                File[] files=file.listFiles();
                for(int j=0;j<files.length;j++){
                   showDir(indent+3,files[j]);
                }
            }
      }

      //遍历目录的方法
      public static  void visitAllDirsAndFiles(File dir){
        System.out.println(dir);
        if(dir.isDirectory()){
            String [] filename=dir.list();
            for(int i=0;i<filename.length;i++){
                visitAllDirsAndFiles(new File(dir,filename[i]));
            }
        }
      }


}
