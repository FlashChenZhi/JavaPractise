package example.array;

import back.practise.practise0813.test.Array;

import java.util.Arrays;

/**
 *   数组填充
 *   通过Arrays.fill(arrayname,value) 方法和Arrays.fill(arrayname ,starting index ,ending index ,value) 方法向数组中填充元素
 */
public class ArrayPadding {
    public static void main(String[] args) {
        int[] array=new int[6];
        Arrays.fill(array,100);
        for(int i=0,n=array.length;i<n;i++){
            System.out.println("数组中的元素有："+array[i]);
        }
        System.out.println();
        //说明：下面fill()填充方法表示：将起始索引位置为3到最终索引位置-1 的元素赋值为26
        Arrays.fill(array,3,6,26);
        for(int i=0,n=array.length;i<n;i++){
            System.out.println("填充数组后的元素有："+array[i]);
        }


    }
}
