package example.array;

import java.util.Arrays;

/**
 * 比较两个数组是否相等：使用 equals ()方法来判断数组是否相等，返回布尔值
 */
public class ArrayCompare {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6};
        int[] array3 = {1,2,3,4};
        String str1=Arrays.equals(array1, array2)? "相等": "不相等";
        String str2=Arrays.equals(array1, array3)?  "相等": "不相等";
        String str3=Arrays.equals(array2, array3)? "相等":"不相等";
        System.out.println("数组 array1 是否与数组 array2 相等? ："+ str1);
        System.out.println("数组 array1 是否与数组 array3 相等? ：" +str2);
        System.out.println("数组 array2 是否与数组 array3 相等? ：" +str3);
    }
}
