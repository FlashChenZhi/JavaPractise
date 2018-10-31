package back.practise.practise0813.test;

/**         String和StringBuffer以及StringBuilder之间的区别
 * 1.StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象
 * 2.StringBuilder 和 StringBuffer 之间的最大不同在于：StringBuilder 的方法不是线程安全的（不能同步访问）
 * 3.StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类
 * 4.在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 */
public class Buffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("菜鸟教程网址：");
        sb.append("www.runoob");
        sb.append(".com");
        System.out.println(sb);
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("NEHCXELAHSALF");
        stringBuffer.reverse();
        System.out.println("反转字符串："+stringBuffer);
        System.out.println("删除字符串中指定范围字符："+stringBuffer.delete(0,5));
        System.out.println("使用给定 String 中的字符替换此序列的子字符串中的字符："+stringBuffer.replace(4,8,"Zhi"));
    }
}
