package example.array;

import back.practise.practise0813.test.Array;

import java.util.Arrays;

/**
 * 数组排序和查找
 * 使用sort()方法对Java数组进行排序，及使用 binarySearch() 方法来查找数组中的元素
 */
public class SortAndSearch {
    public static void main(String[] args) throws Exception{
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("数组长度为：",array);
        int index=Arrays.binarySearch(array,2);
        System.out.println("元素 2  在排序后的第 " + index + " 个位置");
    }

    public static void printArray(String message,int array[]){
        System.out.println(message+array.length+"\t从小到大的排序结果：");
        for(int i=0;i<array.length;i++){
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

}
