package example.array;

import java.util.ArrayList;

/**
 * 数组差集：使用 removeAll () 方法来计算两个数组的差集
 * eg：将两个数组元素对比,用于对比组中的元素未出现在实验组中的元素，则为两者的差集
 */
public class DifferenceSet {
    public static void main(String[] args) {
        ArrayList objArray1 = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"元素0");
        objArray2.add(1,"元素1");
        objArray2.add(2,"元素2");
        objArray2.add(3,"元素3");
        objArray1.add(0,"元素0");
        objArray1.add(1,"元素1");
        objArray1.add(2,"元素A");
        System.out.println("array1 的元素：" +objArray1);
        System.out.println("array2 的元素：" +objArray2);
        objArray1.removeAll(objArray2);
        System.out.println("array1 与 array2 数组差集为："+objArray1);

    }
}
