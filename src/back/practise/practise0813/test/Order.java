package back.practise.practise0813.test;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Order {

    public static void main(String[] args) {
        int[] arr={20,60,51,81,285,12,165,51,81,318,186,9,70};
        for(int m:arr){
            System.out.print(m+"\t");
        }
        System.out.println("\n"+"---------------从小到大---------------");
        Order.toBig(arr);
        for(int x:arr){
            System.out.print("\t"+x);
        }
        System.out.println("\n"+"---------------从大到小---------------");
        Order.toSmall(arr);
        for(int y:arr){
            System.out.print("\t"+y);
        }
    }

    //从大到小
    //遍历数组里除最后一个的其他所有数，因为最后的对象没有与之可以相比较的数
    public static  int[] toSmall(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            /*遍历数组里没有排序的所有数，并与上一个数进行比较
             *“k=i+1”因为自身一定等于自身，所以相比没有意义
             *而前面已经排好序的数，在比较也没有意义
             */
            for(int k=i+1;k<arr.length;k++){
                if(arr[k]>arr[i]){
                    int number=arr[i];
                    arr[i]=arr[k];
                    arr[k]=number;
                }
            }
        }
        return arr;
    }

    //从小到大
    public static  int [] toBig(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
