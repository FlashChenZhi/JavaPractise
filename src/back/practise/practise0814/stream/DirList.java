package back.practise.practise0814.stream;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String name="/test/tmp";
        File file=new File(name);
        if(file.isDirectory()){
            System.out.println("目录名称："+name);
            String s[]=file.list();
            for(int i=0;i<s.length;i++){
                File f=new File(name+"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i]+"是一个目录！");
                }else{
                    System.out.println(s[i]+"是一个文件！");
                }
            }

        }else{
            System.out.println(name + " 不是一个目录");
        }

    }

}
