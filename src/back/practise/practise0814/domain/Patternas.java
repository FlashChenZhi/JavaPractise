package back.practise.practise0814.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternas{

    public static void main(String[] args) {
        String str="I am noob from runoob.com";
        String pattern=".*runoob.*";

        boolean isMacth= Pattern.matches(pattern,str);
        System.out.println("字符串中是否包含了 'runoob' 子字符串?\t"+isMacth);


        // 按指定模式在字符串查找
        String line="This order was placed for QT3000! OK? ";
        String pt="(\\D*)(\\d+)(.*)";
        // 创建 Pattern 对象
        Pattern p=Pattern.compile(pt);
        // 现在创建 matcher 对象
        Matcher matcher=p.matcher(line);
        System.out.println("该字符串组可分成："+
        matcher.groupCount()+"组");
        if(matcher.find()){
            System.out.println("捕获组1："+matcher.group(0));
            System.out.println("捕获组2："+matcher.group(1));
            System.out.println("捕获组3："+matcher.group(2));
            System.out.println("捕获组4："+matcher.group(3));
        }


    }

}
