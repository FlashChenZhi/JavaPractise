package back.practise.practise0814.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckQQ {

    public static void main(String[] args) {
        String reg="[1-9][0-9]{4,14}";
        String qq="123456789012345";
        System.out.println(qq.matches(reg)? "合法QQ" : "非法QQ");

        //appendReplacement 和 appendTail 方法用于文本替换
        String str="a*b";
        String test="aabfooaabfooabfoobkkk";
        String replace="-";
        Pattern pattern=Pattern.compile(str);
        Matcher matcher=pattern.matcher(test);
        StringBuffer sb=new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb,replace);
        }
        matcher.appendTail(sb);
        System.out.println(sb);
    }
}
