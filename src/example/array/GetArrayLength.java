package example.array;

/**
 * 获取数组长度
 */
public class GetArrayLength {
    public static void main(String[] args) {
        String[][] data = new String[2][5];
        System.out.println("获取一维数组的长度："+data.length);
        System.out.println("获取二维数组的长度："+data[0].length);
    }
}
