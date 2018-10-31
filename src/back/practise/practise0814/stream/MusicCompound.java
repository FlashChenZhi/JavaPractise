package back.practise.practise0814.stream;

import javax.annotation.processing.FilerException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MusicCompound {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        FileInputStream fis=null;
        String [] musicName={"G://MyDownloads/Download/我只在乎你.mp3","G://MyDownloads/Download/星月神话.mp3"};
        //设置byte数组，每次往输出流中传入8K的内容
        byte by[]=new byte[1024*80];
        try {
            fos=new FileOutputStream("G://MyDownloads/Download/你是我的星月神话-FLASH子鹏.mp3");
            for(int i=0;i<2;i++){
                int count=0;
                fis=new FileInputStream(musicName[i]);
                //跳过前面3M的歌曲内容
                fis.skip(1024*1024*3);
                while(fis.read(by)!=-1){
                    fos.write(by);
                    count++;
                    System.out.println(count);
                    //要截取中间2MB的内容，每次输入8k的内容，所以输入的次数是1024*2/8
                    if(count==1024*2/8){
                        break;
                    }
                }
            }
        } catch (FilerException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //输出完成后关闭输入输出流
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
