package example.array;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);     //数组排序
        printArray("数组排序", array);
        int index=Arrays.binarySearch(array,666);
        System.out.println("元素 1 所在位置（负数为不存在）：" + index);
        int newIndex=-index-1;
        array=insertElement(array,666,newIndex);
        printArray("向数组添加元素666：",array);

        //数组扩容方法
//        String[] str={"A","B","C"};
////        String[] names = new String[] { "A", "B", "C" };
//        String[] extended=new String[6];
//        extended[3]="D";
//        extended[4]="E";
//        extended[5]="F";
//        System.arraycopy(str,0,extended,0,str.length);
//        for(String s:extended){
//            System.out.print(s+" ");
//        }
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [长度：" + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static int [] insertElement(int original[],int element, int index){
        int length=original.length;
        int destination[]=new int[length+1];
        //从原数组特定位置复制数据到目标数组的特定位置,(简单就是数组之间复制)
        System.arraycopy(original,0,destination,0,index);
        destination[index]=element;
        System.arraycopy(original,index,destination,index+1,length-index);
        return destination;
    }
}
