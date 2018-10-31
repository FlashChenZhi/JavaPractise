package example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplaceEmp {

    public static void main(String[] args) {
        String str="Hello World";
        String regEx= "[abcdH]";
        String reStr= "";

        Pattern pattern=Pattern.compile(regEx);
        Matcher matcher=pattern.matcher(str);
        reStr=matcher.replaceAll("").trim();
        System.out.println("正则表达式替换字符串中指定的字符："+reStr);

    }
}
