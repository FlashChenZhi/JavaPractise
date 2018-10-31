package example.networkInstance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *  网页抓取
 *  使用 net.URL 类的 URL() 构造函数来抓取网页
 */
public class GetNetwork {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://www.runoob.com");
        BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("data.front.html5"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
           bw.write(line);
           bw.newLine();
        }
        br.close();
        bw.close();
    }

}
