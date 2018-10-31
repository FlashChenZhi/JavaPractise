package back.practise.practise0814.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  1.匹配序列模式
 *  matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式
 *  它们的不同是 matches 要求整个序列都匹配，而lookingAt 不要求
 *  lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配
 *  2.替换匹配文本
 *  replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本
 *  不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配
 *
 */
public class RegexMatchesDemo {
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static final String INPUT2 = "ooooofoooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;

    private static String  DOG="dog";
    private static String  DISPLAY="The dog says meow and All dogs say meow.";
    private static String  REPLACE="cat";

    public static void main(String[] args) {
//        pattern=Pattern.compile(REGEX);
//        matcher=pattern.matcher(INPUT);
//        matcher2=pattern.matcher(INPUT2);
//
//        System.out.println(matcher.lookingAt());
//        System.out.println(matcher.matches());
//        System.out.println("\n");
//        System.out.println(matcher2.lookingAt());
//        System.out.println(matcher2.matches());

        pattern=Pattern.compile(DOG);
        matcher=pattern.matcher(DISPLAY);
        DISPLAY=matcher.replaceAll(REPLACE);
        System.out.println(DISPLAY);
    }

}
