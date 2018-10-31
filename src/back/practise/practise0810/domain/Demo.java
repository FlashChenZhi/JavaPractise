package back.practise.practise0810.domain;

/**
 * 1.对整数进行格式化：%[index$][标识][最小宽度]转换方式
 * 格式化字符串由4部分组成，特殊的格式常以 %index$开头;
 * index从1开始取值，表示将第index个参数拿进来进行格式化;
 * [最小宽度]的含义也很好理解，就是最终该整数转化的字符串最少包含多少位数字
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(String.format("%1$,09d", -3123));
        System.out.println(String.format("%1$9d", -31));
        System.out.println(String.format("%1$-9d", -31));
        System.out.println(String.format("%1$(9d", -31));
        System.out.println(String.format("%1$#9x", 5689));
    }
}
