package back.practise.practise0814.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher=pattern.matcher(INPUT);
        int count=0;
        while(matcher.find()){
            count++;
            System.out.println("Macther number："+count);
            System.out.println("开始："+matcher.start());
            System.out.println("结束："+matcher.end());
        }

    }
}
