package back.practise.practise0814.stream;

import java.io.File;

public class DeleteFileDemo {

    public static void main(String[] args) {
        File file=new File("/test");
        deleteFolder(file);
    }

    // 删除文件及目录的方法
    public static  void deleteFolder(File file){
        File [] files=file.listFiles();
        if(files!=null){
            for(File f:files){
                if(f.isDirectory()){
                    System.out.println("传入文件是父目录");
                    deleteFolder(f);
                }else{
                    f.delete();
                }
            }
        }
            file.delete();
            System.out.println("删除文件成功！");
    }
}
