package example.string;

/**     字符串之间的三种比较方法
 *  1.调用compareTo()方法，直接比较
 *  2.调用compareToIgnoreCase()方法，可忽略大小写
 *  3.调用compareTo()方法，其参数转成字符串
 */
public class StringCompareEmp {
    /**
     * compareTo() 方法实现思路：
     * 1.两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较；
     * 2.如果两个字符数组的长度不一样，并且较短的数组和较长数组所有对应位置的字符都相同，则返回两个数组的长度之差
     */
    public static void main(String[] args) {
        String str1="Hello World";
        String str2="hello world";
        Object obj=str1;

        System.out.println("直接比较法："+str1.compareTo(str2));
        System.out.println("忽略大小写："+str1.compareToIgnoreCase(str2));
        System.out.println("转成字符串："+str1.compareTo(obj.toString()));
    }
}
