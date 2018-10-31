package back.practise.practise0813.test;

import java.util.Arrays;

/**
 * java.util.Arrays类能方便地操作数组，它提供的所有方法都是静态的
 */
public class Array {

    public static void main(String[] args) {
        //声明数组变量(两种)
//        Array [] arrays;
        Array array [];
        int size=5;
        double [] doubles=new double[size];
        doubles[0]=1.38;
        doubles[1]=2.5;
        doubles[2]=1.85;
        doubles[3]=3.66;
        doubles[4]=2.0;
        double tatol=0;
//        for (int i=0;i<size;i++){
//            tatol+=doubles[i];
//        }
//        System.out.println("计算该数组元素总和为："+tatol);

        double [] mylist={12.6,20.5,36.8,42.1,58.0,66.6};
        //第一种：显示数组中所有元素
        for (int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+"\t\t");
        }
        System.out.println();
        //第二种：显示数组中所有元素
        for (double d:mylist){
            System.out.print(d+"\t\t");
        }
        System.out.println();
        //计算数组中所有元素之和
        double sum=0;
        for(int i=0;i<mylist.length;i++){
            sum+=mylist[i];
        }
        System.out.println("数组元素之和："+sum);
        //查找数组中最大元素
        double max=mylist[0];
        for(int i=1;i<mylist.length;i++){
            if(mylist[i]>max){
                max=mylist[i];
            }
        }
        System.out.println("该数组中最大元素是："+max);
        double [] doub=reverse(mylist);
        System.out.println("调用方法返回值："+doub[doub.length-1]);

        //定义二维数组
       int[][] arr={{5,7,9},{12,14,16,18},{23,25,36,47},{22,54,65,15},{22,34}};
       //定义求和变量
        Array array1=new Array();
        System.out.println("该二维数组的元素之和为："+array1.add(arr));

        //给数组赋值：通过fill方法
        int [] array2=new int[5];
        int [] test={3,5,1,8,6,2,9};
        Arrays.fill(array2,3);
        for (int i = 0; i < array2.length; i++) {
            System.out.print("通过方法给予数组赋值："+array2[i] + " ");
        }
        System.out.println("\n");
        // 将数组的第2和第3个元素赋值为8
//        Arrays.fill(arrays,2,4,8);
//        System.out.print("将数组的索引位置为2和3的赋值为8：");
//        Array.output(arrays);
        //对数组排序：通过sort方法,按升序(可根据数组中指定索引位置的元素)
        Arrays.sort(test,2,5);
        System.out.println("根据数组中指定索引位置的元素排序：");
        Array.output(test);
        //比较数组：通过equals方法比较数组中元素值是否相等
        System.out.println("通过equals方法比较数组中元素值是否相等："+Arrays.equals(array2,test));
        //克隆后数组元素是否相等
        int [] clone=test.clone();
        System.out.println("克隆后数组元素是否相等："+Arrays.equals(clone,test));
        //查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找法操作
        Arrays.sort(test);
        System.out.println("查找数组元素："+Arrays.binarySearch(test,1));

    }

    public static double[] reverse(double [] list){
        double [] result=new double [list.length];
        for(int i=0,j=result.length-1;i<list.length;i++,j--){
            result[j]=list[i];
        }
        return  result;
    }

    public int add(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //利用嵌套for循环来遍历二维数组
            for(int j=0;j<arr[i].length;j++){
//                System.out.println("长度："+arr[i].length);
                //每遍历出一个元素则叠加一次
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void output(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

}
